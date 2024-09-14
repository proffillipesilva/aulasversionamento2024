#!/bin/bash
cd /servicos  # entra na pasta serviços
unzip ./aula11.zip # descompacta os arquivos e os guarda na pasta servicos
rm aula11.zip  # remove o arquivo .zip após a descompactação
python3 -m http.server 9000 --directory aula11 # roda na porta 9000 e roda no diretorio aula11
