package br.com.java;

import java.util.Scanner;

public class Comparacao {
	
	public static void main (String[]args) {
		
		
	Scanner teclado = new Scanner(System.in);
	System.out.println("Digite sua idade");
	int idade = Integer.parseInt(teclado.nextLine());
	if (idade >=18) {
		System.out.println("Você é obrigado a votar");
		
	
	} else if (idade >=16) {
		System.out.println("Você já pode votar se quiser");
	
	} else {
		System.out.println("Você não é obrigado a votar");
	}
	System.out.println("Fim da aplicação");
	teclado.close();
	
	
	
	}
}
