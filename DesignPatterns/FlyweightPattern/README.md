# Flyweight Pattern

Faz parte do grupo Structural Pattern. É usado para reduzir o número de objetos criados reduzindo o uso da memória e almentando a performance. Objetos que são similares ao procurado ficam estocados e são reusados. Novos objetos são criados quando nenhum atende ao requisito.

TODO: Cuidado, Flyweight não é só um cache de objetos. O objetivo não é criar menos objetos, é sim permitir a criação de
uma grande quantidade de objetos. Como?
1. Extrai a parte comum e "pesada" em outro objeto.
2. Deixa o cliente cuidar de criar esses objetos pesados.
3. Recebe esses objetos pesados como parâmetro para criar nossos flyweights. O flyweight guardará uma referência para o
objeto grande. Dessa forma, o flyweight fica um objeto bem "levinho" e não tem problema instanciar vários dele (lembre-se
que "flyweight" quer dizer "peso-mosca", aquela categoria do boxe).
