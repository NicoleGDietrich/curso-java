package br.com.javaaula7;

public class Exercicio7 {
	
	public static void main(String[] args) {
		
		/**
		 * 7) Crie um programa que imprima os valores abaixo no console:
		 * x
		 * xx
		 * xxx
		 * xxxx
		 * xxxxx
		 */
		
		for (int i=0; i<5; i++) {
			for(int j = 0; j<=i; j++) {
				System.out.print("x");
			}
			System.out.println("");
		}
	}

}
