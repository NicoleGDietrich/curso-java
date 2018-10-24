package br.com.javaaula8;

import java.util.Scanner;

public class Exercicio4 {
	
	public static void main(String[] args) {
		
		/**
		 * 4) Crie um programa que solicite o nome de 10 pessoas e em seguida apresente os nomes
		 * informados na ordem inversa.
		 */
		
		Scanner teclado = new Scanner (System.in);
		String [] nomes = new String [10];
		for (int i = 0; i < nomes.length;i++) {
			System.out.printf("Informe o %dº nome: \n", i+1);
			nomes[i]=teclado.nextLine();
		}
		System.out.println("A ordem inversa da lista é");
		for (int i =nomes.length -1; i>=0; i--) {
			System.out.println(nomes[i]);
		}
	}

}
