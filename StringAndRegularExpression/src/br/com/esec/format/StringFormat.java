package br.com.esec.format;

import java.util.Date;

public class StringFormat {
	public static void main(String args[]){             
	      
		//São usados dois parâmetros para formatar.
		//Primeiro parâmetro recebe instruões para formatação.
		//Segundo parâmetro recebe a String que será formatada.
		
		//Método format()
        String formattedString = String.format("Order with OrdId : %d and Amount: %d is missing", 40021, 3000);       
        System.out.println(formattedString); 
        //Método printf()
        System.out.printf("Order with OrdId : %d  and Amount: %d is missing \n", 40021, 3000);
      
        //Usando %s para especificar String
        String str = String.format("Hello %s", "Raj");
        System.out.println(str);
      
        //Formata a data para String no formato MM/dd/yy com o método format()
        str = String.format("Today is %tD", new Date());
        System.out.println(str);
      
        //Conversão de datas para String
        //Formata a data para String com o método printf()
        Date today = new Date();
        System.out.printf("Date in dd/mm/yy format %td/%tm/%ty %n", today,today,today );
        System.out.printf("Today is %tB %te, %tY %n", today,today,today,today);
      
        //Adicionando zeros antes do número
        System.out.printf("Amount : %08d %n" , 221);
        
        //Escrevendo positivo e negativo antes dos números
        System.out.printf("positive number : +%d %n", 1534632142);
        System.out.printf("negative number : -%d %n", 989899);
      
        //Escrevendo ponto flutuante
        System.out.printf("%f %n", Math.E);
      
        //Pega somente três números depois do ponto
        System.out.printf("%.3f %n", Math.E);
      
        //Escreve 8 caracteres depois de pular 3 casas
        System.out.printf("%8.3f %n", Math.E);
      
        //Adiciona vírgula em números mais longos
        System.out.printf("Total %,d messages processed today", 10000000);
    }



}
