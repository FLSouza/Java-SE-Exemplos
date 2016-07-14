# Abstract Factory Pattern

Faz parte do grupo Creational Pattern. Gira em torno de uma super-factory que cria outras factories. Uma interface é responsável por criar uma factory de objetos relacionados sem especificar explicitamente suas classes.

TODO: A forma de se obter uma instância da abstract factory é via dependency injection ou factory method.
      Uma abstract factory produz vários tipos de objetos. No exemplo você usou uma factory pra obter shapes e outra pra
      obter colors. Use o exemplo abaixo como base:

      interface WidgetFactory {
          Frame getFrame();
          Button getButton();
      }

      class SwingWidgetFactory {
          // cria os componentes gráficos usando o framework Swing
      }

      class SwtWidgetFactory {
          // cria os componentes gráficos usando o framework SWT
      }

      void example(File config) {
          // não faz sentido usar abstract factory se a escolha da factory não for dinâmica
          // aqui estamos recebendo a escolha de um arquivo de configuração
          // getFactoryFromConfig() é um factory method que lê o arquivo de configuração e instancia a factory certa
          WidgetFactory factory = getFactoryFromConfig(config);
          Frame frame = factory.getFrame();
          Button button = factory.getButton();
          frame.add(button);
          frame.show();
          // acabamos de exibir uma tela para o usuário e nosso código nem precisou saber se foi usado Swing ou SWT
          // viva abstract factory!
      }
