package br.com.javaaula5;

import java.util.Scanner;

public class Exercicio4 {
	
	public static void main (String [] args) {
		
		//4) Escreva um programa que solicite a idade do usu�rio e em seguida apresente uma 
		// mensagem informando se o usu�rio pode fazer CNH. Caso o usu�rio n�o tenha idade 
		// suficiente deve ser apresentado uma mensagem informando quantos anos faltam para que 
		// ele possa solicitar a CNH.


		 Scanner teclado = new Scanner(System.in);
	     System.out.println("Digite sua idade");
	     int idade = Integer.parseInt(teclado.nextLine());
	     int anosquefaltam = 18 - idade;
	     
	     if (idade >= 18) {
	    	 System.out.println("Voc� j� pode solicitar a CNH");
	     }else {
	    	 
	    	 System.out.println("Faltam "+anosquefaltam+" anos para que voc� possa solicitar a CNH");
	    	 
	     }
	     
	    	 teclado.close();
	     }
	     
		
}
