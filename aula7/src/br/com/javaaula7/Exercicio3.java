package br.com.javaaula7;

import java.util.Scanner;

public class Exercicio3 {
	
	public static void main(String[] args) {
		
	/**
	 * 3) Crie um programa que solicite 5 n�meros e em seguida escreva o valor do maior n�mero
	 * informado.
	 */
		Scanner teclado = new Scanner (System.in);
		int maior=0;
		for (int i = 0; i <5;i++) {
			System.out.println("Informe o " + (i+1)+ "� n�mero:");
			int num = Integer.parseInt(teclado.nextLine());
			if(i == 0) {
				maior = num;
			}
			if (num > maior) {
				maior = num;
			}
			
		}
		System.out.println("O maior n�mero �: "+maior);
	}

}
