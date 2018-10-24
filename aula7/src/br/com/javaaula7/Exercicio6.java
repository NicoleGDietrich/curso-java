package br.com.javaaula7;

import java.util.Scanner;

public class Exercicio6 {
	
	public static void main(String[] args) {
		
		/**
		 * 6) Crie um programa que solicite uma palavra e em seguida escreva a palavra de forma
		 * inversa. EX: (Felipe => epileF).
		 */
		Scanner teclado = new Scanner (System.in);
		System.out.println("Digite uma palavra");
		String palavra = teclado.nextLine();
		for(int i = palavra.length()-1; i>=0; i--) {
			System.out.println(palavra.charAt(i));
		}
	}

}
