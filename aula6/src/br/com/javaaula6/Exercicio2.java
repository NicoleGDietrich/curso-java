package br.com.javaaula6;

import java.util.Scanner;

public class Exercicio2 {
	
	public static void main(String[] args) {
		
		/**
		 * 2) Escreva um programa que solicite um n�mero entre 1 e 3 para o usu�rio. Em seguida
		 * escreva uma mensagem informando o valor da op��o selecionada. As mensagens devem ser
		 * de acordo com a tabela abaixo:
		 * 1 - Sacar
		 * 2 - Depositar
		 * 3 - Verificar Saldo
		 * ![1-3] - Op��o Inv�lida
		 */
		
		
		Scanner teclado = new Scanner (System.in);
		System.out.println("Digite um n�mero entre 1 e 3");
		int num = Integer.parseInt(teclado.nextLine());
		
		switch (num) {
		default:
			System.out.println("Op��o inv�lida");
			break;
		case 1:
			System.out.println("Sacar");
			break;
			
		case 2:
			System.out.println("Depositar");
			break;	
			
		case 3:
			System.out.println("Verificar Saldo");
			break;
		
		
	}

}
}
