package br.com.cursojava;

import java.util.Scanner;

public class Exercicio4 {
	
	public static void main (String[]args) {
		
		//4) Escreva um programa que solicite a idade do usuário em anos e apresente 
		//o valor da idade informada em meses.
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("Digite sua idade");
		int idade = Integer.parseInt(teclado.nextLine());
		int meses = idade*12;
		System.out.println("Sua idade em meses é: "+meses);
		teclado.close();
		
		
		
	}
	
	

}
