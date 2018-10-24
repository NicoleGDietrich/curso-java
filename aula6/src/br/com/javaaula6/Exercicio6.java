package br.com.javaaula6;

public class Exercicio6 {

	public static void main(String[] args) {

		/**
		 * 6)Escreva um programa que escreva todos os números primos entre 1 e 50.
		 * Considere como número primo o número que é apenas divisível por 1 e por ele
		 * mesmo.
		 */

		int numero = 1;
		boolean primo = true;
		while (numero <= 50) {
			int divisor = 2;
			primo = true;
			while (divisor < numero) {
				if (numero % divisor == 0) {
					primo = false;
					break;
				}
				divisor++;
			}
			if (primo) {
				System.out.println(numero + ", ");
			}
			numero++;

		}

		System.out.println("");
		System.out.println("Fim do exercício");

	}
}
