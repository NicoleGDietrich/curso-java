package br.com.cursojava;

import java.util.Scanner;

public class ExemploLeitor {
	
	public static void main (String[]args) {
		
		Scanner teclado = new Scanner(System.in); // faz com que o scanner monitore a entrada padrão do sistema.
		System.out.println("Digite seu nome");
		String nome = teclado.nextLine();//o tipo de dado que o nextLine retorna é String.
		System.out.printf("O nome digitado foi %s \n", nome);
		teclado.close();
		
		
	}

}
