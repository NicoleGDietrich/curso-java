package br.com.javaaula8;

import java.util.Scanner;

public class Exercicio3 {
	
	public static void main(String[] args) {
		
		/**
		 * 3) Crie um programa que solicite 5 notas e em seguida apresente o valor da maior nota
		 * juntamente com a posi��o da nota dentro do array.
		 */
		Scanner teclado = new Scanner (System.in);
		int posMaior = 0;
        double[] notas = new double [5];
		
		for (int i = 0; i <5;i++) {
		System.out.println("Informe a " + (i+1)+ "� nota:");
        notas[i] = Integer.parseInt(teclado.nextLine());
        if(notas[i]>notas[posMaior]) {
        	posMaior = i;
        }
		
	}
		System.out.println("O maior n�mero �: "+notas[posMaior]);
		System.out.println("A posi��o � "+ posMaior);

}
}
