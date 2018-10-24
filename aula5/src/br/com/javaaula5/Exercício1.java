package br.com.javaaula5;

import java.util.Scanner;

public class Exercício1 {
	
	public static void main (String [] args) {
		
		//1) Crie um programa que solicite o nome do usuário e em seguida informe a quantidade
		// de letras do nome informado.
		
		 Scanner teclado = new Scanner(System.in);
	     System.out.println("Digite seu nome");
	     String nome = teclado.nextLine();
	     System.out.println("Seu nome tem "+nome.length()+" letras");
	     teclado.close();

	}

}
