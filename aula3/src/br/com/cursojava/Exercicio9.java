package br.com.cursojava;

import java.util.Scanner;

public class Exercicio9 {
	
	public static void main (String[]args) {
		

//9. Escreva um programa que solicite 3 notas e em seguida calcule a média ponderada 
//aplicando os pesos 2, 3 e 5 respectivamente. 
//Ao final o programa deve apresentar o resultado da média calculada.
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("Digite a nota 1");
		double nota1 = Double.parseDouble(teclado.nextLine());
		System.out.println("Digite a nota 2");
		double nota2 = Double.parseDouble(teclado.nextLine());
		System.out.println("Digite a nota 3");
		double nota3 = Double.parseDouble(teclado.nextLine());
		double mediaponderada = ((nota1*2)+(nota2*3)+(nota3*5))/10;
		System.out.println("A média ponderada é " + mediaponderada);
		teclado.close();
		
	}

}
