package br.com.cursojava;

import java.util.Scanner;

public class Exercicio2 {

	public static void main (String[]args) {
		
		//2) Escreva um programa que solicite 3 n�meros reais e em seguida apresente o resultado
		// da m�dia dos n�meros informados.
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("Digite o primeiro n�mero");
		double n1 = Double.parseDouble(teclado.nextLine());
		System.out.println("Digite o segundo n�mero");
		double n2 = Double.parseDouble(teclado.nextLine());
		System.out.println("Digite o terceiro n�mero");
		double n3 = Double.parseDouble(teclado.nextLine());
		double media = (n1+n2+n3)/3;
		System.out.println("A m�dia dos n�meros �: "+ media);
		
		teclado.close();
		
	}
	
}
