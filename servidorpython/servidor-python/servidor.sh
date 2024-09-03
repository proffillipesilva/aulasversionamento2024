#!/bin/bash
cd /servicos  # entra na pasta serviços
unzip ./aula11.zip # descompacta os arquivos
rm aula11.zip  # remove o arquivo .zip após a descompactação
python3 -m http.server 9000 # roda na porta 9000