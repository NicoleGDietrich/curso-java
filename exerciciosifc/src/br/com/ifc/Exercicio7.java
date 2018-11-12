package br.com.ifc;

import java.util.Scanner;

public class Exercicio7 {
	
	/** 7. Faça um programa que aceite um valor como entrada e gere como saída 
	o valor acrescido em 15% **/
	
public static void main(String[] args) {
		
		Scanner teclado = new Scanner (System.in);
		System.out.println("Digite um número: ");
		double numero = Double.parseDouble(teclado.nextLine());
		double aux = numero * 0.15;
		double numeroMais15Porcento = numero + aux;
		System.out.println("O número " + numero + " acrescido em 15% é igual a: " + numeroMais15Porcento );
		
		teclado.close();
}

}
