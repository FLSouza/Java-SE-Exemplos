# Java
No controle de exceções em java a **Família Throwable** possui três importantes subcategorias:

**Checked exceptions:** São exceções que ocorrem em tempo de compilação e são também chamadas **compile time exceptions**. Essas exceções não podem ser ignoradas e precisam ser tratadas antes da compilação.


**Unchecked exceptions:** São exceções que ocorrem em tempo de execução e são também chamadas **runtime exceptions**. Essas exceções são ignoradas em tempo de compilação e normalmente são causadas por erros de lógica e uso indevido de alguma API. 

**Errors:** Não são exceções, mas sim problemas que surgem e que estão além do controle do desenvolvedor. Não deve ser tratado.

**try-catch-finally**: O Finally é sempre executado, independente se uma exceção seja lançada. O uso do finally block facilita a liberação de algum recurso que tenha sido usado e ainda não sido fechado.

**try-with-resource**: Utiliza a semântica do Finally de uma maneira mais simples.