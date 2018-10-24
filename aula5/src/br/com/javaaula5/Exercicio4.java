package br.com.javaaula5;

import java.util.Scanner;

public class Exercicio4 {
	
	public static void main (String [] args) {
		
		//4) Escreva um programa que solicite a idade do usuário e em seguida apresente uma 
		// mensagem informando se o usuário pode fazer CNH. Caso o usuário não tenha idade 
		// suficiente deve ser apresentado uma mensagem informando quantos anos faltam para que 
		// ele possa solicitar a CNH.


		 Scanner teclado = new Scanner(System.in);
	     System.out.println("Digite sua idade");
	     int idade = Integer.parseInt(teclado.nextLine());
	     int anosquefaltam = 18 - idade;
	     
	     if (idade >= 18) {
	    	 System.out.println("Você já pode solicitar a CNH");
	     }else {
	    	 
	    	 System.out.println("Faltam "+anosquefaltam+" anos para que você possa solicitar a CNH");
	    	 
	     }
	     
	    	 teclado.close();
	     }
	     
		
}
