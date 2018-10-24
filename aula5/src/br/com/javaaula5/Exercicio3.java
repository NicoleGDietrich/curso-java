package br.com.javaaula5;

import java.util.Scanner;

public class Exercicio3 {
	
	public static void main (String [] args) {
		
		//3) Crie um programa que solicite uma frase e em seguida apresente a frase digitada sem 
		// as vogais.
		

		 Scanner teclado = new Scanner(System.in);
	     System.out.println("Digite uma frase");
	     String frase =  teclado.nextLine();
			frase = frase.replace("a", "");
			frase = frase.replace("e", "");
			frase = frase.replace("i", "");
			frase = frase.replace("o", "");
			frase = frase.replace("u", "");
		System.out.println("Frase sem vogais: "+ frase);
		teclado.close();
	}
}