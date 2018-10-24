package br.com.ifc;

import java.util.Random;

public class VetorMultiplicacaoEscalar {
	
public static void main (String[]args) {
		
		int[] vetor1 = new int[5];
		int[] vetor2 = new int[5];
		
		
		 Random r = new Random();
	        for (int i = 0; i < vetor1.length; i++) {
	            vetor1[i] = r.nextInt(50);
	        }
	        System.out.println("Vetor 1:");
	        for (int i = 0; i < vetor1.length; i = i + 1) {
	            System.out.println(i + ":" + vetor1[i]);
	        }
	        for (int i = 0; i < vetor2.length; i++) {
	            vetor2[i] = r.nextInt(50);
	        }
	        for (int i = 0; i < vetor2.length; i++) {
	        	vetor2 [i] = vetor1[i] *2;
	        }
	        
	        for (int i = 0; i < vetor2.length; i++) {
	        }
	        System.out.println("Vetor 2:");
	        for (int i = 0; i < vetor2.length; i = i + 1) {
	            System.out.println(i + ":" + vetor2[i]);
	        }

	       
}
}


