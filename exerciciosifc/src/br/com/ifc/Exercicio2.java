package br.com.ifc;

import java.util.Scanner;

public class Exercicio2 {
	
	public static void main (String[] args) {
	

	//2. Fa¸ca um programa imprimir o valor da ´area de um c´ırculo, o usu´ario ir´a 
	//fornecer o raio.
	
	 Scanner teclado = new Scanner(System.in);
	 System.out.println("Digite o valor do raio de um círculo");
	 double raio = Double.parseDouble(teclado.nextLine());
	 double area = Math.PI*(raio*raio);
	 System.out.println("O valor da área do círculo é: "+area);
	 teclado.close();
	 

	}
}
