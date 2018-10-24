package br.com.javaaula5;

import java.util.Scanner;

public class Exercicio5 {
	
	public static void main (String [] args) {
		
		//5) Escreva um programa que solicite um número  e em seguida apresente uma mensagem
		//informando se o número digitado foi "PAR" ou "IMPAR". Todo número par deve ser o resto
		//da divisão por 2 igual a 0.
		
		Scanner teclado = new Scanner(System.in);
	     System.out.println("Digite um número");
	     double numero = Integer.parseInt(teclado.nextLine());
	     if(numero%2 == 0) {
	    	 System.out.println("O número é par");
	     }else {
	    	 System.out.println("O número é impar");
	     }
	     teclado.close();

}
}
