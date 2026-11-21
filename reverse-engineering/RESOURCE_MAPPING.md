# Rastreamento de recursos e animações — evidências do bytecode

Fonte: `bytecode/GameMain.txt` e `bytecode/u.txt` extraídos do JAR original. Este documento distingue observação direta de interpretação.

## Descoberta: carregamento dinâmico dos packs de criaturas

Em `GameMain`, no bloco que começa com a leitura de `g.c(11)` e multiplicação por 43, o programa consulta as tabelas `ae.v` e `ae.w` para selecionar imagens necessárias. O endereço de imagem global é calculado como:

```
imageIndex = 78 + (g.c(11) * 25) + (ae.w[base + slot] & 255)
```

Quando falta uma imagem, o jogo monta o nome do arquivo:

```
"/pack" + (16 + g.c(11)) + ".bin"
```

e o carrega via `q.a(String, int, int)`. O loop percorre **25 slots**, o que concorda com o cabeçalho de 25 entradas observado nos arquivos `pack17.bin`, `pack19.bin`, `pack21.bin` e `pack26.bin`.

**Consequência comprovada:** os packs 16+ estão indexados por `g.c(11)`, que é um identificador numérico do estado do jogo. Não é correto tratar todos os PNGs do pack como uma animação circular. O jogo seleciona subconjuntos de imagens conforme `ae.v`/`ae.w` e a ação atual.

**Hipótese a testar:** `g.c(11)` é o identificador de espécie ou forma; o código prova que indexa o pack, mas ainda não prova a semântica completa.

## Motor `u`

`GameMain.K()` inicializa quatro instâncias `u` chamando `u.a(y, byte[], 57, x, y, 18)`, com o mesmo buffer global `K` e coordenadas calculadas. O número 57 é um índice de sequência, não um número de pack PNG. Em outras rotinas, `GameMain` chama `u.a(int)` para escolher uma sequência, `u.b()` para avançá-la e `u.a(Graphics, Image[])` para desenhar.

**Consequência:** o motor recebe um *fluxo de animação binário* (`K`) separado do catálogo de PNGs; precisa de uma tabela de sequências, tempos e referências de sprites.

## Próximas verificações

1. Extrair e decodificar a inicialização de `GameMain.K:[B`: localizar a leitura de `K` e se há `pack11.bin` envolvido.
2. Decodificar `ae.v` e `ae.w` para associar índices de ação a sprites, incluindo valores negativos como marcadores.
3. Seguir chamadas de `u.a(int)` e `u.a(int,int)` até eventos de tecla/tempo e identificar quais sequências são usadas para comer, dormir, brincar e crescer.
4. Criar testes de paridade contra execução do JAR antes de substituir a simulação HTML5 provisória.

## Critério de fidelidade

Um pack contém *imagens*; uma sequência `u` contém *comandos temporais*. Esses conceitos não devem ser confundidos.
