package br.com.cursojava;

import java.util.Scanner;

public class Exercicio5 {

	public static void main (String[]args) {
		
		//5) Escreva um programa que solicite a idade do usuário em dias e em seguida apresente
		// o valor em dias meses e anos. Considere que cada mês possui 30 dias e que um ano 
        // equivale a 12 meses.
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("Digite sua idade em dias");
		int idade = Integer.parseInt(teclado.nextLine());
		int dias = idade;
		int meses = idade/12;
		int anos = idade/365;
		System.out.println("Sua idade em dias:"+dias +"\nEm meses: " +meses+"\nEm anos: "+anos);
		teclado.close();
		
	}

}
