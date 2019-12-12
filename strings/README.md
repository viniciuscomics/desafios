# Desafio 1: Strings

Para o desenvolvimento deste desafio eu utilizei o template disponibilizado.
Para a função de ajustar o texto de acordo com o número de colunas parametrizada,
eu utilizei recursividade, e a cada linha configurada eu chamo uma outra função que criei
para justificar o texto.

## Exemplo input

`In the beginning God created the heavens and the earth. Now the earth was formless and empty, darkness was over the surface of the deep, and the Spirit of God was hovering over the waters.`

`And God said, "Let there be light," and there was light. God saw that the light was good, and he separated the light from the darkness. God called the light "day," and the darkness he called "night." And there was evening, and there was morning - the first day.`

O texto deve ser parametrizável e se quiser, pode utilizar um texto de input de sua preferência.

### Parte 1 (Básico) - limite 40 caracteres
Você deve seguir o exemplo de output [deste arquivo](https://github.com/idwall/desafios/blob/master/strings/output_parte1.txt), onde basta o texto possuir, no máximo, 40 caracteres por linha. As palavras não podem ser quebradas no meio.

### Parte 2 (Intermediário) - limite 40 caracteres
O exemplo de output está [neste arquivo](https://github.com/idwall/desafios/blob/master/strings/output-parte2.txt), onde além de o arquivo possuir, no máximo, 40 caracteres por linha, o texto deve estar **justificado**.

### Executando o programa
java -jar meujar.jar -> O programa irá executar com os valores default

ou

java - jar meujar.jar "seu texto" [total de colunas] [true|false]-> se justifica ou nao.

ex: java -jar meujar.jar "bla bla bla bla bla bla" 40 true
