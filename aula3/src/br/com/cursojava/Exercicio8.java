package br.com.cursojava;

import java.util.Scanner;

public class Exercicio8 {
	
	public static void main (String[]args) {
		
		//8. Escreva um programa que solicite a base e a altura de um tri�ngulo e em seguida 
		//calcule o valor da �rea.
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("Digite a base do tri�ngulo");
		double base = Double.parseDouble(teclado.nextLine());
		System.out.println("Digite a altura do tri�ngulo");
		double altura = Double.parseDouble(teclado.nextLine());
		double area = (base*altura)/2;
		System.out.println("A �rea do tri�ngulo � "+ area);
		teclado.close();
	}

}
