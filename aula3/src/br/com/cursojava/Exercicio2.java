package br.com.cursojava;

import java.util.Scanner;

public class Exercicio2 {

	public static void main (String[]args) {
		
		//2) Escreva um programa que solicite 3 números reais e em seguida apresente o resultado
		// da média dos números informados.
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("Digite o primeiro número");
		double n1 = Double.parseDouble(teclado.nextLine());
		System.out.println("Digite o segundo número");
		double n2 = Double.parseDouble(teclado.nextLine());
		System.out.println("Digite o terceiro número");
		double n3 = Double.parseDouble(teclado.nextLine());
		double media = (n1+n2+n3)/3;
		System.out.println("A média dos números é: "+ media);
		
		teclado.close();
		
	}
	
}
