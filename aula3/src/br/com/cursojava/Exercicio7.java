package br.com.cursojava;

import java.util.Scanner;

public class Exercicio7 {
	
	public static void main (String[]args) {

	//7) Escreva um programa que solicite 3 notas e em seguida calcule e apresente os 
			//seguintes dados:
			//a) O valor da média
			//b) O valor da maior nota (Math.max)
			//c) O valor da menor nota (Math.max)
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("Digite a nota 1");
		double nota1 = Double.parseDouble(teclado.nextLine());
		System.out.println("Digite a nota 2");
		double nota2 = Double.parseDouble(teclado.nextLine());
		System.out.println("Digite a nota 3");
		double nota3 = Double.parseDouble(teclado.nextLine());
		double media = (nota1+nota2+nota3)/3;
		double maior1 = Math.max(nota1, nota2);
		double maior2 = Math.max(maior1, nota3);
		double menor1 = Math.min(nota1, nota2);
		double menor2 = Math.min(menor1, nota3);
		System.out.println("A média das notas é: "+media+"\nO Valor da maior nota é: " +maior2+"\nO valor da menor nota é: "+menor2);
		teclado.close();
		
		
		
		}
}
