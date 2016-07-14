# Composite Pattern

Faz parte do grupo Structural Pattern. É usado quando é necessário tratar um grupo de objetos de maneira similar a um único objeto.

TODO: O entendimento está errado. Não basta Employee ter uma lista de Employee's, se você ainda tem que saber que é uma
      lista e precisar recuperar a lista pra fazer um `for`, então não é Composite.

Use como exemplo o jQuery. Como você faz pra pegar um elemento é trocar o valor dele?

    var x = $("#meu-id");
    x.val("novo valor");

E pra pegar 10 elementos e trocar o valor de todos eles?

    var x = $(".minha-classe");
    x.val("novo valor");
