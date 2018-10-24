package br.com.javaaula6;

import java.util.Scanner;

public class Exercicio1 {
	
	public static void main(String[] args) {
		
		/**
		 * 1) Crie um programa que solicite um número entre 1 e 12, em seguida escreva o nome 
		 * do mês correspondente ao número digitado. Caso o usuário informe um número fora do 
		 * range (1-12) o programa deve apresentar uma mensagem indicando que o número informado
		 * é inválido.
		 */
		
		Scanner teclado = new Scanner (System.in);
		System.out.println("Digite um número entre 1 e 12");
		int mes = Integer.parseInt(teclado.nextLine());
		
		switch (mes) {
		default:
			System.out.println("Número inválido");
			break;
		case 1:
			System.out.println("Janeiro");
			break;
			
		case 2:
			System.out.println("Fevereiro");
			break;	
			
		case 3:
			System.out.println("Março");
			break;
			
		case 4:
			System.out.println("Abril");
			break;
			
		case 5:
			System.out.println("Maio");
			break;
			
		case 6:
			System.out.println("Junho");
			break;
			
		case 7:
			System.out.println("Julho");
			break;
			
		case 8:
			System.out.println("Agosto");
			break;
		
		case 9:
			System.out.println("Setembro");
			break;
			
		case 10:
			System.out.println("Outubro");
			break;
			
		case 11:
			System.out.println("Novembro");
			break;
			
		case 12:
			System.out.println("Dezembro");
			break;
			
		
	}

}
}