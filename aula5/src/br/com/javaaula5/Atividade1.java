package br.com.javaaula5;

import java.util.Scanner;

public class Atividade1 {
	
	public static void main (String[] args) {
	
	//1) Escreva um programa que solicite 2 n�meros para o usu�rio e em seguida escreva 
	//o resultado da multiplica��o do primeiro n�mero pelo segundo.
		
		
		Scanner teclado = new Scanner(System.in);
	     System.out.println("Digite um n�mero");
	     int numero1 = Integer.parseInt(teclado.nextLine());
	     System.out.println("Digite outro n�mero");
	     int numero2 = Integer.parseInt(teclado.nextLine());
	     int multiplicacao = numero1 * numero2;
	     System.out.println("O resultado da multiplica��o dos dois n�meros � igual a " +multiplicacao);
	     teclado.close();
	    

}
}