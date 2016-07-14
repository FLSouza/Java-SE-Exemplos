# Strategy Pattern

Faz parte do grupo Behavior Pattern. O comportamento ou o algoritmo da classe pode ser modificado em tempo de execução.

TODO: Seu Strategy parece mais um Command. Para ser Strategy, o cliente deve estar desacoplado da implementação escolhida.
Faça essas alterações:
1. A main instancia a estratégia e o contexto baseada em algum critério dinâmico.
2. Um outro método representará o "código cliente", que é alguém que recebe o contexto pronto e não sabe qual estratégia foi escolhida.
3. O código cliente simplesmente chama o método do contexto e recebe o retorno adequado.
