# Utiliza uma imagem base do Ubuntu como ponto de partida
FROM ubuntu:latest

# Atualiza o gerenciador de pacotes
RUN apt-get update && apt-get install -y nginx

# Copia o arquivo de configuração do Nginx para a imagem
COPY nginx.conf /etc/nginx/nginx.conf

# Expõe a porta 80 para o mundo externo
EXPOSE 80

# Comando padrão para executar quando o container iniciar
CMD ["nginx", "-g", "daemon off;"]