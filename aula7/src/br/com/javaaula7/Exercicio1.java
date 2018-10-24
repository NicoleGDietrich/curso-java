package br.com.javaaula7;

import java.util.Scanner;

public class Exercicio1 {
	
	public static void main(String[] args) {
		
		/**
		 * 1) Crie um programa que solicite um número entre 1 e 20 e em seguida calcule e 
		 * apresente o valor do fatorial do número informado.
		 */
		
		Scanner teclado = new Scanner (System.in);
		System.out.println("Digite um número entre 1 e 20");
		int num = Integer.parseInt(teclado.nextLine());
		long fatorial=1;
		int i;
		if (num>=1 && num <=20) {
		for (i = 1; i <= num; i++) {
			fatorial *= i;			
		
	}
		System.out.println(fatorial);	

}
}
}
