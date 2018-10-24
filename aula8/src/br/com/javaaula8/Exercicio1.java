package br.com.javaaula8;

import java.util.Scanner;

public class Exercicio1 {
	
	public static void main(String[] args) {
		
		/**
		 * 1) Crie um programa que solicite 10 notas e em seguida calcule a média das notas e
		 * escreva as notas digitadas juntamente com o valor da média.
		 */
		
		Scanner teclado = new Scanner (System.in);
		double media = 0;
		
		double[] notas = new double [10];
		
		for (int i = 0; i <10;i++) {
		System.out.println("Informe a " + (i+1)+ "º nota:");
        notas[i] = Integer.parseInt(teclado.nextLine());
        media+=notas[i];
		}
		media/=notas.length;
		 for (int i = 0; i < notas.length; i++) {    
		 }
		 System.out.println("Vetor:");
	        for (int i = 0; i < notas.length; i = i + 1) {
	            System.out.print(i + ":" + notas[i]);
 
		        }
	       
	    System.out.println("O valor da média é: "+ media);      
	}
		 		 
	}


		
				
		 
		
	


