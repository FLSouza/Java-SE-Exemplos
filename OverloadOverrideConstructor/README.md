# Java
**Sobrescrita(override):** Utilizada para definir o comportamento de um método de mesmo nome já definido na superclasse.

  - Não modificar a quantidade, ordem e tipo dos argumentos.
    OBS: argumentos são invariantes.
  - Ter o tipo de retorno igual ou compatível respeitando a herança.
    TODO: O tipo de retorno é contravariante, implemente um exemplo.
  - TODO: Faltou falar das exceções, são invariantes, covariantes ou contravariantes?

**Sobrecarga(overload):** Utiliza o nome do método já definido na classe ou superclasse.

- Deve mudar a quantidade ou tipo dos argumentos definidos no método que fará a sobrecarga.

---

**Construtor**: É um método invocado quando é chamado um `new`. Obriga a passagem de parâmetros, caso haja, na criação do objeto.

  - TODO: Faltou falar que não se deve chamar métodos virtuais (overridable) no construtor. Veja *Effective Java 2nd Edition, Item 17* e explique por quê.
