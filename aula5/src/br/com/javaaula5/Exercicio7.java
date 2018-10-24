package br.com.javaaula5;

import java.util.Scanner;

public class Exercicio7 {
	
	public static void main (String [] args) {
		
		//7) Escreva um programa que solicite o valor do salário de uma pessoa e calcule o valor
		// do imposto de renda conforme os dados abaixo:
		//Até 1800 insento
		//de 1800.01 ate 2400.00 7,5%
		//de 2400.01 ate 3600.00 15 %
		//acima de 3600.00       27%
		
		Scanner teclado = new Scanner(System.in);
	     System.out.println("Digite seu salário");
	     double salario = Double.parseDouble(teclado.nextLine());
	     double ir1 = salario*0.075;
	     double ir2 = salario*0.15;
	     double ir3 = salario*0.27;
	     
	     if (salario <= 1800.00) {
	    	 
	    	 System.out.println("Imposto de renda isento");
	     }
	     
	     if (salario >= 1800.01 && salario <= 2400.00) {
	    	 
	    	 System.out.println("O valor do imposto de renda é "+ir1); 
	     }
	     
	     if (salario >= 2400.01 && salario <= 3600.00) {
	    	 
	    	 System.out.println("O valor do imposto de renda é "+ir2);
	     }
	     
	     if (salario >= 3600.00) {
	    	 
	    	 System.out.println("O valor do imposto de renda é "+ir3);
	     }
	     
	     teclado.close();
	      
	}

}
