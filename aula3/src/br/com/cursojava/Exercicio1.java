package br.com.cursojava;

import java.util.Scanner;

public class Exercicio1 {

	public static void main (String[]args) {
		
		//1) Escreva um programa que solicite dois n�meros inteiros e em seguida escreva o valor
		//do maior n�mero informado. Utilize Math.max.
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("Digite um n�mero");
		int n1 = Integer.parseInt(teclado.nextLine());
		System.out.println("Digite outro n�mero");
		int n2 = Integer.parseInt(teclado.nextLine());
		int maior = Math.max(n1,n2);
		System.out.println("O maior n�mero �: "+maior);
		
		teclado.close();
	}
	
}
