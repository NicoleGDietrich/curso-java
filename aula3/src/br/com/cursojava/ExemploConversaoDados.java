package br.com.cursojava;

import java.util.Scanner;

public class ExemploConversaoDados {
	
	public static void main (String[]args) {
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Digite um número");
		String n1 = teclado.nextLine();
		int numero1 = Integer.parseInt(n1); // o metodo parseInt da classe Integer
		//transforma um texto em int.
		System.out.println("Digite outro número");
		
	    int numero2 = Integer.parseInt(teclado.nextLine());//Outra forma
		System.out.println(numero1+numero2);
		
		System.out.println("Digite o preço do produto");
		double preco = Double.parseDouble(teclado.nextLine());
		double desconto = 0.10;
		System.out.println("O valor de desconto é %.2f"+(preco * desconto));
		
	//classe é a representação de um tipo de dado
		
	
		
		teclado.close();
		
	}
	
	

}
