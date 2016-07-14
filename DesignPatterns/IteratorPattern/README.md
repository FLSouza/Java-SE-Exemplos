# Iterator Pattern

Faz parte do grupo Behavioral Pattern. É usado para acessar os elementos de uma coleção de objetos de forma sequencial, sem saber qual é a representaçao do objeto.

TODO: A descrição está um pouco confusa na parte "sem saber qual é a representaçao do objeto".
Por exemplo: Se eu estou iterando por uma coleção de strings, eu posso saber que são strings e eu sei como manipular
strings. O que eu não preciso saber é como percorrer a coleção. Eu posso estar percorrendo uma lista encadeada na ordem
reversa ou percorrendo uma árvore binária na ordem pré-fixada ou percorrendo um grafo acíclico usando busca por profundidade.
Mas não interessa, eu não preciso saber como fazer isso, eu simplesmente chamo `collection.iterator()` e `iterator.next()`
e pronto.
