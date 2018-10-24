package br.com.javaaula5;

import java.util.Scanner;

public class Atividade1 {
	
	public static void main (String[] args) {
	
	//1) Escreva um programa que solicite 2 números para o usuário e em seguida escreva 
	//o resultado da multiplicação do primeiro número pelo segundo.
		
		
		Scanner teclado = new Scanner(System.in);
	     System.out.println("Digite um número");
	     int numero1 = Integer.parseInt(teclado.nextLine());
	     System.out.println("Digite outro número");
	     int numero2 = Integer.parseInt(teclado.nextLine());
	     int multiplicacao = numero1 * numero2;
	     System.out.println("O resultado da multiplicação dos dois números é igual a " +multiplicacao);
	     teclado.close();
	    

}
}