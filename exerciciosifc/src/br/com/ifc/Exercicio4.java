package br.com.ifc;

import java.util.Scanner;

public class Exercicio4 {
	
	//4. Fa�a um programa para calcular a m�dia de tr�s provas, imprima o valor da m�dia.
	
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner (System.in);
		System.out.println("Digite a nota da prova 1:");
		double prova1 = Double.parseDouble(teclado.nextLine());
		System.out.println("Digite a nota da prova 2:");
		double prova2 = Double.parseDouble(teclado.nextLine());;
		System.out.println("Digite a nota da prova 3:");
		double prova3 = Double.parseDouble(teclado.nextLine());;
		double media = (prova1 + prova2 + prova3)/3.0;
		
		System.out.printf("A m�dia �: %.2f" ,media);
		
		teclado.close();
		
		
	}

	
	

}
