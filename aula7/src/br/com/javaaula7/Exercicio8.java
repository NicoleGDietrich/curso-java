package br.com.javaaula7;

public class Exercicio8 {
	
	public static void main(String[] args) {
		
		/**
		 * 8) Crie um programa que imprima os valores abaixo no console:
		 * #####
		 * ####
		 * ###
		 * ##
		 * #
		 */
		
		for (int i=4; i>=0; i--) {
			for (int j =0; j<=i; j++) {
				System.out.print("#");
			}
			System.out.println("");
		}
	}

}
