package br.com.javaaula6;

public class Exercicio3 {
	
	public static void main(String[] args) {
		
		/**
		 * 3)Escreva um programa que imprima o resultado da soma dos 50 primeiros numeros inteiros
		 * positivos. 
		 */
		
		int numero = 1;
		int soma = 0;
		while (numero<=50) {
			soma += numero;
			numero ++;
		}
		System.out.println(soma);
		
	}

}
