package br.com.ifc;

import java.util.Scanner;

public class Exercicio7 {
	
	/** 7. Fa�a um programa que aceite um valor como entrada e gere como sa�da 
	o valor acrescido em 15% **/
	
public static void main(String[] args) {
		
		Scanner teclado = new Scanner (System.in);
		System.out.println("Digite um n�mero: ");
		double numero = Double.parseDouble(teclado.nextLine());
		double aux = numero * 0.15;
		double numeroMais15Porcento = numero + aux;
		System.out.println("O n�mero " + numero + " acrescido em 15% � igual a: " + numeroMais15Porcento );
		
		teclado.close();
}

}
