package br.com.ifc;
import java.util.Random;

public class VetorProdutoCruzado {
	
	 public static void main(String[] args) {
		 
		 
	 
	        double[][] mat = new double[3][3];
	        
	        Random numeros = new Random();
	        int valor = numeros.nextInt(10) + 1;
	         
	        for (int linha = 0; linha < mat.length; linha++) {
	            for (int coluna = 0; coluna < mat[linha].length; coluna++) {
	                valor = numeros.nextInt(10) + 1;
	                mat[linha][coluna] = valor;

	            }
	        }

	        System.out.println("Matriz a:");
	        System.out.println("    ");
	        for (int coluna = 0; coluna < mat[0].length; coluna++) {
	           System.out.print("  C" + coluna + "  ");
	        }
	        System.out.println("");

	        for (int linha = 0; linha < mat.length; linha++) {
	            System.out.print("L" + linha + "  ");
	            for (int coluna = 0; coluna < mat[linha].length; coluna++) {
	                System.out.print(mat[linha][coluna] + "  ");
	            }
	            System.out.println("");
	        }
	        


	 }
}
