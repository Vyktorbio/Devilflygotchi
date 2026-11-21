# Devilflygotchi — Java ME

O jogo modificado está em `Devil_240x320.jar` na raiz. O GitHub Actions baixa o emulador [FreeJ2ME-Web](https://github.com/zb3/freej2me-web), copia a pasta `web` para `emulator/` e publica tudo no GitHub Pages.

## Publicação

Em **Settings → Pages → Build and deployment**, escolha **GitHub Actions**. Depois abra **Actions → Deploy Devilflygotchi** e acompanhe a execução. A página esperada é https://vyktorbio.github.io/Devilflygotchi/.

## Primeiro teste e inicialização automática

O FreeJ2ME-Web **não aceita simplesmente o caminho do JAR para inicializar**. Para preparar o pacote oficial:

1. Abra a página e, no emulador, instale seu `Devil_240x320.jar` usando **Select JAR file**.
2. Ajuste tela para 240×320, tipo de telefone e opções até o jogo funcionar.
3. Use **Export Data** no emulador.
4. Inicie o jogo e anote o parâmetro `app` exibido no endereço.
5. No ZIP exportado, localize a pasta cujo nome é esse ID.
6. Comprima **o conteúdo dessa pasta**, não a pasta externa, em `[app_id].zip`.
7. Envie o ZIP para a pasta `game-packages/` deste repositório.
8. O workflow copiará o ZIP para `emulator/apps/`. O endereço `emulator/run.html?app=[app_id]&fractionScale=1` poderá iniciar o jogo diretamente.

Até concluir os passos acima, a página abre o launcher local do emulador, não o jogo automaticamente.

**Nota:** A compatibilidade do JAR modificado ainda não foi confirmada. O FreeJ2ME-Web depende de CheerpJ e de acesso à internet; alguns servidores podem não servir corretamente requisições HTTP Range exigidas pelo emulador.

## Fontes

- [FreeJ2ME-Web — README e instruções de embedding](https://github.com/zb3/freej2me-web#embedding)
