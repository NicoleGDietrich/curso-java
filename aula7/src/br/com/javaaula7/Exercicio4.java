package br.com.javaaula7;

import java.util.Scanner;

public class Exercicio4 {
	
	public static void main(String[] args) {
		
		/**
		 * 4) Crie um programa que solicite 5 números e em seguida apresente o valor da soma e da
		 * média.
		 */
		
		Scanner teclado = new Scanner (System.in);
		
		int soma = 0;
		for (int i = 0; i <5;i++) {
			System.out.println("Informe o " + (i+1)+ "º número:");
			int num = Integer.parseInt(teclado.nextLine());
			soma += num;
			num ++;
			
	}
		System.out.println("A soma dos números é: " +soma);
		double media = soma/5;
		System.out.println("A média dos número é: "+media);
	}

}
