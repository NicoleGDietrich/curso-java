package br.com.ifc;

import java.util.Scanner;

public class Exercicio6 {
	
	/**6. Fa�a um programa que aceite tr�s notas de provas e a frequ�ncia de um aluno. 
	Imprima aprovado para notas superiores ou iguais a sete e frequ�ncia superior ou 
	igual a 75%. Imprima reprovado caso contr�rio. (Assuma que a frequ�ncia do aluno 
	� dada como um n�mero entre 0 e 100, simbolizando 0 para 0% de frequ�ncia e 
	100 para 100% de frequ�ncia)**/

	
public static void main(String[] args) {
		
		Scanner teclado = new Scanner (System.in);
		System.out.println("Digite a nota da prova 1:");
		double prova1 = Double.parseDouble(teclado.nextLine());
		System.out.println("Digite a nota da prova 2:");
		double prova2 = Double.parseDouble(teclado.nextLine());;
		System.out.println("Digite a nota da prova 3:");
		double prova3 = Double.parseDouble(teclado.nextLine());;
		double media = (prova1 + prova2 + prova3)/3.0;
		System.out.println("Digite sua frequ�ncia");
		double frequencia = Double.parseDouble(teclado.nextLine());
		System.out.println("A m�dia �: " + media + " e a frequ�ncia �: "+frequencia+"%" );
		
		if(frequencia >=0 && frequencia <=100) {
	
		if(media >= 7 && frequencia >= 75) {
			System.out.println("Voc� foi aprovado");
		
			
		}else {
			System.out.println("Voc� foi reprovado");
			
		}
		}else {
			System.out.println("Frequ�ncia inv�lida");
		}
		
		
		
		teclado.close();
		
		
	}

}
