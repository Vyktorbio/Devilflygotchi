# Devilflygotchi — jogo Java ME original no navegador

O arquivo **`Devil_240x320.jar`** na raiz é o jogo original **Tamagotchi Monster** (MIDP 2.0 / CLDC 1.0; 240 × 320). A página principal agora executa **o bytecode do JAR**, por meio de [FreeJ2ME-Web](https://github.com/zb3/freej2me-web), em vez de reconstruir sprites e comportamentos por aproximação.

- **Jogo original:** https://vyktorbio.github.io/Devilflygotchi/
- **Protótipo HTML5 anterior (preservado):** https://vyktorbio.github.io/Devilflygotchi/legacy.html
- **Emulador direto:** https://vyktorbio.github.io/Devilflygotchi/emulator/run.html?jar=game.jar&fractionScale=1&mobile=1

## Como funciona

O workflow `.github/workflows/pages.yml` monta o site e publica uma cópia do diretório `web` do FreeJ2ME-Web em `emulator/`, incluindo os arquivos necessários para rodá-lo. Ele também copia o JAR original para `emulator/jar/game.jar`. O emulador suporta o modo direto `run.html?jar=game.jar` (ver implementação de `web/src/main.js` no FreeJ2ME-Web). Não é necessário criar tabelas de sprites, reimplementar as regras de cuidado ou importar manualmente um ZIP para **este modo de inicialização**.

A dependência do emulador está fixada no commit `c19416e75cbc15f9a27f7e967ee81cb108761e30`; o repositório do jogo conserva seu arquivo original intacto. A página web experimental anterior foi salva integralmente em `legacy.html`.

## Controles

Em celulares com tela sensível ao toque, o emulador exibe o teclado virtual. No computador, use as setas, Enter, F1/F2 (teclas de função do celular) e Esc para as opções do emulador. O botão **Reiniciar** recarrega o emulador, sem apagar deliberadamente os dados salvos. **Tela própria** abre o jogo sem a moldura da página principal.

## Estado da validação

O build verifica a integridade ZIP do JAR, o manifesto `MIDlet-1` e a presença dos arquivos necessários do emulador. **Isso não prova que o jogo abriu, que o áudio funcionou nem que o salvamento foi recuperado.** A validação real exige abrir a página após o deploy e testar nascimento, animações, alimentação, sono, evolução e persistência. O FreeJ2ME-Web usa CheerpJ e requer internet; depende também de requisições HTTP Range adequadamente atendidas pelo servidor.

Se a página não iniciar, tente o endereço do emulador direto. É possível variar opções de telefone, áudio e tela pressionando Esc, conforme as [instruções do FreeJ2ME-Web](https://github.com/zb3/freej2me-web#game-doesnt-work).

## Licenças

O FreeJ2ME-Web é desenvolvido por zb3 e distribuído conforme sua licença, copiada para `emulator/LICENSE` durante o build. O manifesto do jogo-base declara Namco como fornecedor. Disponibilizar o emulador e o JAR não transfere os direitos autorais dos recursos do jogo.
