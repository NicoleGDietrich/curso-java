package br.com.cursojava;

import java.util.Scanner;

public class Exercicio5 {

	public static void main (String[]args) {
		
		//5) Escreva um programa que solicite a idade do usuário em dias e em seguida apresente
		// o valor em dias meses e anos. Considere que cada mês possui 30 dias e que um ano 
        // equivale a 12 meses.
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("Digite sua idade em dias");
		int idadeDias = Integer.parseInt(teclado.nextLine());
		int anos = idadeDias / 360;
		int resto = idadeDias % 360;
		int meses = resto/30;
		int dias = resto % 30;
		System.out.printf("Sua idade é: %d anos %d meses e %d dias" , anos, meses, dias);
		teclado.close();
		
	}

}
