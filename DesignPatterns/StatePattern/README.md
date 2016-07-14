# State Pattern

Faz parte do grupo Behavior Pattern. O comportamento de uma classe muda de acordo com o estado em que ela se encontra.

TODO: O método `doAction` deve ser chamado em `context` e não em `state`. Context delega para State, que faz a operação e
escolhe o próximo estado. Exemplo:

    // em main()
    context.doAction();

    // em Context
    public void doAction() {
        currentState.doAction(this);
    }
    
    // em StartState
    public void doAction(Context context) {
        // faz a operação, suponha que nessa operação acabei calculando duas variáveis: x e y
        context.setCurrentState(new EndState(x, y));
    }
