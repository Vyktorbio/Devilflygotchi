# Engenharia reversa — Devilflygotchi (fase 1)

Fonte analisada: artefato `devilflygotchi-port-analysis(1).zip` enviado na conversa, contendo `manifest.txt`, desmontagem `javap -c -p` de 32 classes e recursos extraídos; inventário dos PNGs extraídos dos packs. **Esta é uma análise estática, não uma execução do jogo.**

## Identidade e arquitetura verificadas

- `MIDlet-Name: Tamagotchi Monster`, versão `1.1.4`, fornecedor declarado `Namco`.
- Ponto de entrada: `MIDlet-1: Tamagotchi Monster, /icon.png, GameMain`.
- Plataforma original: `MIDP-2.0`, `CLDC-1.0`.
- A classe `GameMain` contém o controlador central; a desmontagem dela possui aproximadamente 399 mil caracteres e 95 declarações de métodos.
- `y` contém rotinas que recebem `Graphics`, `Image` e coordenadas: candidato forte a renderizador 2D.
- `u` possui desenho com `Graphics` e `Image[]` e rotinas de atualização: candidato a componente de animação/sprite.
- `g` tem métodos de leitura e escrita de `byte[]`, mas o papel exato ainda não foi demonstrado.
- `f` faz referências a `.mid`, `audio/midi`, `.mp3`, `audio/mpeg`, `.amr` e `audio/amr`: subsistema de áudio.
- `n` referencia arquivos `/language_*.bin` e codificações UTF8/ISO8859_1: subsistema de idiomas.
- `ad` referencia trilhas como `birth.mid`, `button.mid`, `angry.mid` e `badend.mid`: indica eventos e efeitos, **não prova por si só regras de gameplay**.
- Os métodos e campos estão em grande parte ofuscados; nomes como `a()` ou `b()` não identificam seu significado.

## Seleção de criaturas

A seleção solicitada é **pack17, pack19, pack21 e pack26**. O `pack26` é o penúltimo entre os packs numerados identificados, pois existe `pack27`. As imagens dos packs 2–15 são recursos/animações, não criaturas selecionáveis. A página HTML5 foi atualizada para limitar a seleção a esses quatro packs.

## O que ainda NÃO está demonstrado

- Correspondência entre cada frame e os estados de movimento, alimentação, sono ou humor.
- Tabelas de evolução, crescimento, morte, nascimento e necessidades.
- Formato completo dos arquivos `pack*.bin` e relação entre offsets, frames e eventos.
- Semântica dos campos de estado e persistência.
- Equivalência entre o protótipo HTML5 e a lógica original.

**Importante:** a versão web atual usa regras provisórias de fome, humor e energia. Não deve ser descrita como um port fiel.

## Plano de reconstrução verificável

1. Identificar no bytecode de `GameMain` os métodos que referenciam `u`, `y` e os eventos de entrada; documentar a máquina de estados e suas transições.
2. Decodificar o índice de `pack*.bin` e correlacionar quadros a sequências de animação por evidência de chamadas, não apenas por ordem de arquivos.
3. Localizar as rotinas de gravação/leitura de estado, documentar o formato e criar testes de ida-e-volta.
4. Implementar regras em um módulo JavaScript separado do renderizador, com testes de transição e persistência.
5. Comparar cada tela e ação com a execução do JAR original antes de declarar paridade.

## Limites de direitos

O manifesto atribui o jogo-base à Namco. A engenharia reversa técnica não altera automaticamente a titularidade de imagens, músicas ou código. Antes de redistribuir comercialmente uma conversão fiel, verificar as permissões aplicáveis.
