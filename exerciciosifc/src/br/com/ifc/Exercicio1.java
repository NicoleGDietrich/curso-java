package br.com.ifc;

import java.util.Scanner;

public class Exercicio1 {
	
	  //1. Faça um programa que converta uma temperatura em graus Celcius para graus Fahrenheit.
    
	public static void main (String[]args){
        
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite uma temperatura em graus Celcius para converter em Fahrenheit");
        double celsius = Double.parseDouble(teclado.nextLine());
        double fahrenheit= 1.8 * celsius + 32;
        System.out.printf("A temperatura em Fahrenheit é %.2f ", fahrenheit);
        teclado.close();
    }

}
