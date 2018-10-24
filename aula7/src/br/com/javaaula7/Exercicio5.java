package br.com.javaaula7;

import java.util.Scanner;

public class Exercicio5 {
	
	public static void main(String[] args) {
		
		/**
		 * 5) Crie um programa que solicite uma frase e em seguida apresente as letras dos índices
		 * impares. 
		 */
		
		Scanner teclado = new Scanner (System.in);
		System.out.println("Digite uma frase");
	     String frase = teclado.nextLine();
	 for (int i =0; i<frase.length(); i++) {
		 if (i%2 !=0) {
			 System.out.print(frase.charAt(i));
		 }
	    	 
	     }
		
	}

}
