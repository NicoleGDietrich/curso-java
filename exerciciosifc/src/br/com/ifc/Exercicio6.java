package br.com.ifc;

import java.util.Scanner;

public class Exercicio6 {
	
	/**6. Faça um programa que aceite três notas de provas e a frequência de um aluno. 
	Imprima aprovado para notas superiores ou iguais a sete e frequência superior ou 
	igual a 75%. Imprima reprovado caso contrário. (Assuma que a frequência do aluno 
	é dada como um número entre 0 e 100, simbolizando 0 para 0% de frequência e 
	100 para 100% de frequência)**/

	
public static void main(String[] args) {
		
		Scanner teclado = new Scanner (System.in);
		System.out.println("Digite a nota da prova 1:");
		double prova1 = Double.parseDouble(teclado.nextLine());
		System.out.println("Digite a nota da prova 2:");
		double prova2 = Double.parseDouble(teclado.nextLine());;
		System.out.println("Digite a nota da prova 3:");
		double prova3 = Double.parseDouble(teclado.nextLine());;
		double media = (prova1 + prova2 + prova3)/3.0;
		System.out.println("Digite sua frequência");
		double frequencia = Double.parseDouble(teclado.nextLine());
		System.out.println("A média é: " + media + " e a frequência é: "+frequencia+"%" );
		
		if(frequencia >=0 && frequencia <=100) {
	
		if(media >= 7 && frequencia >= 75) {
			System.out.println("Você foi aprovado");
		
			
		}else {
			System.out.println("Você foi reprovado");
			
		}
		}else {
			System.out.println("Frequência inválida");
		}
		
		
		
		teclado.close();
		
		
	}

}
