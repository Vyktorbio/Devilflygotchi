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


## Fase 2 — análise de métodos com evidências do bytecode

**Máquina de animação da classe `u` (confirmado):**
- `u.a(y, byte[], int, int, int, int)` (linhas 203–259 da desmontagem) recebe o renderizador `y`, uma sequência binária, índice inicial, posição X/Y e um parâmetro adicional. Inicializa contadores `z` e `y`, lê o byte inicial para `h`, marca `a=true` e chama `g()`.
- `u.a(int)` (linhas 308–335) reinicia os contadores, troca o índice de sequência `e` e lê o primeiro byte da nova sequência. Portanto, existe **seleção explícita de sequência**, não apenas rotação contínua de PNGs.
- `u.b()` (linhas 348–486) é uma rotina de avanço: verifica se a animação está ativa, respeita bits de estado `l & 4` e `l & 8`, decrementa o contador `h` e, ao zerar, incrementa os contadores `z` e `y`, consulta bytes e chama `g()`. **A duração dos quadros vem dos dados binários**, não de um intervalo fixo.
- `u.a(Graphics, Image[])` (linhas 487+) é a rotina de desenho. A ligação exata entre índices binários e imagens ainda precisa ser reconstruída.

**Persistência original (confirmado):**
- A classe `l` chama `javax.microedition.rms.RecordStore.openRecordStore`, `getRecord`, `setRecord`, `addRecord` e `closeRecordStore` (linhas 122–469). Logo, o jogo usa **RMS (Record Management System)** do Java ME, e não armazenamento de navegador. O formato binário salvo ainda não está decodificado.

**Estado e relógio (confirmado):**
- `GameMain.b(long)` (linhas 3666–3692) itera por 33 índices e chama `z.a(index, delta)` e `z.b(index, delta)`, depois ajusta o relógio via `k()` e `c(long)`.
- `GameMain.c(long)` (linhas 3693–3716) divide um inteiro de 64 bits entre os campos de estado 9 e 10 de `g`.
- `GameMain.k()` (linhas 3717–3745) recompõe esse valor de 64 bits a partir dos campos 9 e 10. Isso comprova um **contador/valor temporal de 64 bits persistido em dois inteiros**, mas sua unidade física ainda não está estabelecida.
- `GameMain.S()` (linhas 3295+) lê `g.c(11)`, calcula um deslocamento de tabela por multiplicação por 10 e escreve índices 26–29 a partir de `ae.r`. Trata-se de uma **tabela de parâmetros dependente do estado 11**; atribuir nomes como espécie, idade ou evolução sem mais evidências seria especulativo.

**Correção de hipótese anterior:** a classe `g` é acessada como estrutura de estado numérico por `GameMain`; a classe `l` é a que efetivamente demonstra chamadas ao RMS. O protótipo HTML5 atual não reproduz esses mecanismos.

### Próxima etapa de implementação

Decodificar a sequência binária consumida por `u`, identificar onde `GameMain` inicializa as sequências e construir testes de avanço de quadros a partir de amostras reais. Em paralelo, rastrear as chamadas `l` → `RecordStore` e os campos `g` para reconstruir o formato do save. Só substituir as regras do navegador após confirmar os vínculos.

## Fase 3 — formato dos arquivos `packNN.bin` (validado em arquivos reais)

O cabeçalho começa com um **inteiro big-endian de 16 bits** indicando a quantidade de posições da tabela. Nos quatro arquivos estudados esse valor é 25 (`00 19`). Seguem **25 deslocamentos absolutos big-endian de 32 bits**. Cada entrada não vazia aponta para um PNG completo, terminado pelo chunk `IEND`. Entradas finais vazias repetem o deslocamento final (tamanho total do arquivo). Exemplo: `pack17.bin` começa com `00 19 00 00 00 6a`, isto é, 25 posições e primeira imagem no offset decimal 106.

| Arquivo | Tamanho (bytes) | Slots | PNGs validados |
|---|---:|---:|---:|
| `pack17.bin` | 7826 | 25 | 21 |
| `pack19.bin` | 9266 | 25 | 22 |
| `pack21.bin` | 6700 | 25 | 16 |
| `pack26.bin` | 11822 | 25 | 25 |

Foi implementado `tools/decode_pack_archive.py` para extrair por offset e validar os limites dos chunks PNG, sem busca heurística de assinaturas. A execução local sobre os quatro arquivos originais extraiu **84 PNGs**, e dois testes locais passaram (arquivos reais e entrada truncada). As imagens são recursos gráficos, **não** uma tabela de sequências temporais; a classe `u` consome outro bloco de bytes para o controle de quadros.

**Análise de `u.c()`**: a sequência de animação usa um índice `e` em uma tabela de offsets de **2 bytes little-endian** (`n[e*2] | n[e*2+1]<<8`). Para avançar por `z` registros, o método lê `n[offset+1]` como contador assinado e salta `8*contador+3` bytes por registro. O método `u.b()` decrementa `h` por atualização e interpreta valores de controle `-2` e `-3`. Isso é um formato diferente do arquivo de PNGs; **não** confundir os dois.

A identificação do bloco binário `n`, sua origem em `GameMain` e a ligação de índices de desenho às imagens permanecem pendentes.
