package br.com.javaaula7;

import java.util.Scanner;

public class Exercicio4 {
	
	public static void main(String[] args) {
		
		/**
		 * 4) Crie um programa que solicite 5 n�meros e em seguida apresente o valor da soma e da
		 * m�dia.
		 */
		
		Scanner teclado = new Scanner (System.in);
		
		int soma = 0;
		for (int i = 0; i <5;i++) {
			System.out.println("Informe o " + (i+1)+ "� n�mero:");
			int num = Integer.parseInt(teclado.nextLine());
			soma += num;
			num ++;
			
	}
		System.out.println("A soma dos n�meros �: " +soma);
		double media = soma/5;
		System.out.println("A m�dia dos n�mero �: "+media);
	}

}
