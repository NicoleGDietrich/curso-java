package br.com.javaaula7;

import java.util.Scanner;

public class Exercicio3 {
	
	public static void main(String[] args) {
		
	/**
	 * 3) Crie um programa que solicite 5 números e em seguida escreva o valor do maior número
	 * informado.
	 */
		Scanner teclado = new Scanner (System.in);
		int maior=0;
		for (int i = 0; i <5;i++) {
			System.out.println("Informe o " + (i+1)+ "º número:");
			int num = Integer.parseInt(teclado.nextLine());
			if(i == 0) {
				maior = num;
			}
			if (num > maior) {
				maior = num;
			}
			
		}
		System.out.println("O maior número é: "+maior);
	}

}
