package br.com.javaaula6;

import java.util.Scanner;

public class Exercicio4 {
	
	public static void main(String[] args) {
		
		/**
		 * 4) Escreva um programa que solicite 3 notas e em seguida calcule e apresente o valor da 
		 * média das notas. O programa deve ser executado até que a primeira nota tenha um valor 
		 * negativo.
		 */
		
		Scanner teclado = new Scanner (System.in);
		
	double nota1 = 0;
	double nota2 = 0;
	double nota3 = 0;
	double media = 0;
	System.out.println("Digite a primeira nota");
	nota1 = Double.parseDouble(teclado.nextLine());
	while (nota1 >= 0) {
		
		System.out.println("Digite a segunda nota");
		nota2 = Double.parseDouble(teclado.nextLine());
		
		System.out.println("Digite a terceira nota");
		nota3 = Double.parseDouble(teclado.nextLine());
	    
		media = (nota1+nota2+nota3)/3.0;
		System.out.println("A média é: "+media);
		
		System.out.println("Digite a primeira nota");
		nota1 = Double.parseDouble(teclado.nextLine());
	}
	
	System.out.println("Fim do exercício");
	
		
			

	}

}
