# pegando a imagem linux inicialmente vazia
FROM ubuntu:latest
# atualizando o repositorio de pacotes para poder instalar depois os pacotes mais recentes
RUN apt-get update 
# instalando o python3
RUN apt-get install python3 -y
# instalando o unzip
RUN apt-get install unzip -y
# Copiando meu arquivo de script
COPY ./servidor.sh .
# criando uma pasta chamada servicos onde vão ficar meus dados
RUN mkdir servicos
# copiando o zip para dentro da pasta de serviços
COPY ./aula11.zip ./servicos
# expondo a porta para todos acessarem
EXPOSE 9000
# rodar o meu servidor
#CMD ["python3", "-m", "http.server", "9000"]
ENTRYPOINT [ "/servidor.sh" ]