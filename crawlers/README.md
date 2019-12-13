# Desafio 2: Crawlers

Para o desenvolvimento deste desafio eu utilizei o Spring Boot.
Criei uma api rest que executa o input passado e retorna o resultado proposto no desafio.
E tambem foi criado um app desktop que consome a api criada por mim e a api do telegram.

Na api eu externalizei alguns parametros, utilizando o arquivo application.properties;

## properties api server;
reddit.domain=https://old.reddit.com/r/ -> url do reddit
reddit.timeout-second=10 -> timeout em segundos, para a chamada no reddit
reddit.min-pontos=5000 -> valor minimo para buscar uma thread no reddit
reddit.offline=false -> Esse parametro é para quando não tem internet, e caso tem o html da pagina do reddit e queira fazer um teste.
reddit.path-html=path\\hmlt\\redit\\cats.html -> Caminho do arquivo html do reddit, caso o parametro acima esteja true.

## properties consumidor;
reddit.url-api=http://localhost:8080/topics/  -> url da api server
telegram.token=seu token                      -> token gerado pelo bot do telegram
telegram.url-api=https://api.telegram.org/bot -> url do servico  telegran
telegram.chat-id=id chat					  -> id do chat do canal publico


## Executando API Server;

java -jar apiserver.jar -> irá subir com o application.properties default

ou 

java -jar apiserver.jar -Dspring.config.location=your.properties


## Executando App consumidor;
Obs: Necessario que tenha iniciado a API Server.

java -jar appconsumer.jar cats;brazil;worldnews

ou 

java -jar appconsumer.jar /NadaPraFazer cats;brazil;worldnews

## Entrada
- Lista com nomes de subreddits separados por ponto-e-vírgula (`;`). Ex: "askreddit;worldnews;cats"

### Parte 1
Gerar e imprimir uma lista contendo a pontuação, subreddit, título da thread, link para os comentários da thread e link da thread.
Essa parte pode ser um CLI simples, desde que a formatação da impressão fique legível.

### Parte 2
Construir um robô que nos envie essa lista via Telegram sempre que receber o comando `/NadaPraFazer [+ Lista de subrredits]` (ex.: `/NadaPraFazer programming;dogs;brazil`)
