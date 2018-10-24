package br.com.javaaula8;

public class Exercicio2 {
	
	public static void main(String[] args) {
		
		/**
		 * 2) Crie um programa que crie um array com os valores 1,3,2 e em seguida processe o 
		 * array para que os valores se posicionem na forma 3,2,1.
		 */
		
		int [] notas = {1,3,2};
		for (int nota: notas) {
			System.out.print(nota+ " ");
		}
		int temp = 0;
		for (int i =0; i< notas.length -1; i++) {
			temp = notas[i];
			notas[i] = notas[i+1];
			notas [i+1] = temp;
		}
		System.out.println("");
		for (int nota: notas) {
			System.out.print(nota + " ");
		}
	}

}
