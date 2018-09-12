package br.com.cursojava;

import java.util.Scanner;

public class Exercicio8 {
	
	public static void main (String[]args) {
		
		//8. Escreva um programa que solicite a base e a altura de um triângulo e em seguida 
		//calcule o valor da área.
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("Digite a base do triângulo");
		double base = Double.parseDouble(teclado.nextLine());
		System.out.println("Digite a altura do triângulo");
		double altura = Double.parseDouble(teclado.nextLine());
		double area = (base*altura)/2;
		System.out.println("A área do triângulo é "+ area);
		teclado.close();
	}

}
