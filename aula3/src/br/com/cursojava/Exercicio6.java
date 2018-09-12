package br.com.cursojava;

import java.util.Scanner;

public class Exercicio6 {

	public static void main (String[]args) {
		
		//6) Escreva um programa que solicite o valor de um produto e o percentual de desconto,
		//em seguida o programa deve apresentar o valor do  desconto e o valor do produto após
		//a aplicação do desconto.
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("Digite o valor do produto");
		double valor = Double.parseDouble(teclado.nextLine());
		System.out.println("Digite o valor do desconto");
		double porcentagem = Double.parseDouble(teclado.nextLine());
		double aux = porcentagem/100;
		double valordesconto = valor*aux;
		double result = valor - valordesconto;
		System.out.println("O valor do desconto é: "+valordesconto+"\nE o valor após a aplicação do desconto é " +result);
		teclado.close();
		
		
		
	}
	
}
