package br.com.ifc;

import java.util.Random;

public class VetorProdutoInterno {
	
public static void main (String[]args) {
		
		int[] vetor1 = new int[5];
		int[] vetor2 = new int[5];
		int[] vetor3 = new int[5];
		
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
	        System.out.println("Vetor 2:");
	        for (int i = 0; i < vetor2.length; i = i + 1) {
	            System.out.println(i + ":" + vetor2[i]);
	        }

	        for (int i = 0; i < vetor3.length; i++) {
	        	vetor3 [i] = vetor1[i] * vetor2[i];
	        }
	        
	        for (int i = 0; i < vetor3.length; i++) {
	           
	        }
	        System.out.println("Vetor 3 (Vetor 1 * Vetor 2):");
	        for (int i = 0; i < vetor3.length; i = i + 1) {
	            System.out.println(i + ":" + vetor3[i]);
}
}

}
