package br.com.javaaula5;

import java.util.Scanner;

public class Exercicio5 {
	
	public static void main (String [] args) {
		
		//5) Escreva um programa que solicite um n�mero  e em seguida apresente uma mensagem
		//informando se o n�mero digitado foi "PAR" ou "IMPAR". Todo n�mero par deve ser o resto
		//da divis�o por 2 igual a 0.
		
		Scanner teclado = new Scanner(System.in);
	     System.out.println("Digite um n�mero");
	     double numero = Integer.parseInt(teclado.nextLine());
	     if(numero%2 == 0) {
	    	 System.out.println("O n�mero � par");
	     }else {
	    	 System.out.println("O n�mero � impar");
	     }
	     teclado.close();

}
}
