package br.com.javaaula5;

import java.util.Scanner;

public class Exercicio6 {
	
	public static void main (String [] args) {

	//6) Escreva um programa que solicite a idade, a altura e o peso de uma pessoa, em 
	//seguida calcule o IMC utilizando a fórmula IMC = peso/(altura*altura). O programa
	// deve apresentar uma mensagem informando se o imc está abaixo normal ou obeso de acordo
	// com a tabela abaixo:
	
	//Abaixo de 17         "Muito abaixo do peso"
	//Entre 17 e 18,49     "Abaixo do peso"
	//Entre 18,5 e 24,99   "Peso normal"
	//Entre 25 e 29,99     "Acima do peso"
	//Entre 30 e 34,99     "Obesidade I"
	//Entre 35 e 39,99     "Obesidade II(severa)"
	//Acima de 40          "Obesidade III (mórbida)"
		
		Scanner teclado = new Scanner(System.in);
	     System.out.println("Digite sua idade");
	     int idade = Integer.parseInt(teclado.nextLine());
	     System.out.println("Digite seu peso");
	     double peso = Double.parseDouble(teclado.nextLine());
	     System.out.println("Digite sua altura");
	     double altura = Double.parseDouble(teclado.nextLine());
	     double imc = peso/(altura*altura);
	     
	     if (imc<17) {
	    	 
	    	 System.out.println("Muito abaixo do peso");
	     }
	     if (imc >=17 && imc <= 18.49) {
	    	 
	    	 System.out.println("Abaixo do peso");
	     }
	     
	     if (imc >= 18.5 && imc <=25.99) {
	    	 
	    	 System.out.println("Peso normal");
	    	 
	     }
	     
	     if (imc >= 25 && imc <= 29.9) {
	    	 
	    	 System.out.println("Acima do peso");
	     }
	     
	     if (imc >= 30 && imc <= 34.9) {
	    	 
	    	 System.out.println("Obesidade I (severa)");
	     }
	     
	     if (imc >= 35 && imc <= 39.99) {
	    	 
	    	 System.out.println("Obesidade II");
	     }
	     
	     if (imc >= 40) {
	    	 
	    	 System.out.println("Obesidade III (mórbida)");
	     }
	     
	     teclado.close();
	

		
	}
}

	
