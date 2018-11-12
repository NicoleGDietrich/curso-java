package br.com.ifc;

import java.util.Scanner;

public class Exercicio8 {
	
	//8. Faça um programa para verificar se um ano é bissexto.

	 public static void main(String[] args){
	        Scanner teclado = new Scanner(System.in);
	        int ano;
	        
	        System.out.println("Digite um ano para saber se é bissexto");
	        ano = teclado.nextInt();
	     
	        if(ano % 400 == 0){
	            System.out.println(ano + " é bissexto.");
	       
	        } else if((ano % 4 == 0) && (ano % 100 != 0)){
	            System.out.println(ano + " é bissexto.");
	        } else{
	            System.out.println(ano + " não é bissexto");
	        }
	        
	        teclado.close();
	    }
	 
	
}
