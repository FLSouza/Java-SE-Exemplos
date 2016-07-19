# Java
**Sobrescrita(override):** Utilizada para definir o comportamento de um método de mesmo nome já definido na superclasse.

  - Não modificar a quantidade, ordem e tipo dos argumentos. Os argumentos são invariantes.
  - Ter o tipo de retorno igual ou compatível respeitando a herança.
  - O tipo de retorno é contravariante.(Olhar o exemplo implementado no projeto)
  - Exceções são contravariantes.(Olhar o exemplo implementado no projeto)

**Sobrecarga(overload):** Utiliza o nome do método já definido na classe ou superclasse.

- Deve mudar a quantidade ou tipo dos argumentos definidos no método que fará a sobrecarga.

---

**Construtor**: É um método invocado quando é chamado um `new`. Obriga a passagem de parâmetros, caso haja, na criação do objeto.

O contrutor nunca deve invocar métodos **overridable**, direto ou indiretamente. O motivo é que o construtor da superclasse é executado antes do construtor da subclasse. Dessa maneira o método **overridable** na subclasse vai ser invocado antes do construtor da subclasse, se o método depender da inicialização de uma variável feita no construtor da subclasse, o método não irá se comportar como o esperado.

	public class Super {
       // O construtor está invocando um método overridable
       public Super() {
           overrideMe();
       }
       public void overrideMe() {
       }	
	}
	
	public final class Sub extends Super {
       private final Date date; 
       //Variável sendo inicializada no construtor da subclasse
       Sub() {
           date = new Date();
	   }
       // Método invocado pelo construtor da superclasse.
       // Este método será invocado pela superclasse antes da variável 'date' ser 	   // inicializada pelo construtor da subclasse.
       @Override 
       public void overrideMe() {
           System.out.println(date);
	   }
       public static void main(String[] args) {
           Sub sub = new Sub();
           sub.overrideMe();
	   }	
	 }
  	
  
  	
