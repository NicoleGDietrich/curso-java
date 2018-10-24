package br.com.javaaula5;

import java.util.Scanner;

public class Exercicio2 {
	
	public static void main (String [] args) {
		
		//2) Crie um programa que solicite 3 notas e em seguida calcule a média das notas. Se a 
		//  média for maior ou igual a 7 escreva "Aprovado" se não escreva "Reprovado".
		
		 Scanner teclado = new Scanner(System.in);
	     System.out.println("Digite a nota 1");
	     double nota1 = Double.parseDouble(teclado.nextLine());
	     System.out.println("Digite a nota 2");
	     double nota2 = Double.parseDouble(teclado.nextLine());
	     System.out.println("Digite a nota 3");
	     double nota3 = Double.parseDouble(teclado.nextLine());
	     double media = (nota1+nota2+nota3)/3.0;
	     if (media>=7) {
	    	 System.out.println("Aprovado");
	     }else {
	    	 System.out.println("Reprovado");
	     }
	     
	     teclado.close();
	     
	}

}
