package br.com.cursojava;

import java.util.Scanner;

public class Exercicio3 {
	
	public static void main (String[]args) {
		
		//3) Escreva um programa que solicite a idade do usuário em anos e em seguida apresente a 
		// a idade do usuário após 20 anos.
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("Digite sua idade");
		int idade = Integer.parseInt((teclado.nextLine()));
		int res = idade + 20;
		System.out.println("Sua idade daqui a 20 anos será: " +res);
		
		teclado.close();
		
	}


}
