package br.com.javaaula9;

import java.util.Arrays;
import java.util.Scanner;

public class Exercicio1 {
	
	public static void main(String[] args) {
		
		/**
		 * 1) Escreva um programa que solicite 3 notas para a turma de 10 alunos e em seguida
		 * calcule a m�dia de cada aluno juntamente com a m�dia da turma. Ao final o programa 
		 * deve apresentar as 3 notas do aluno juntamente com sua m�dia e posteriormente deve 
		 * apresentar a m�dia final da turma.
		 */
		
		Scanner teclado = new Scanner (System.in);
		double mediaFinal= 0;
		double soma = 0;
		
		int i = 0;
		int j = 0;
		
        double[][] notas = new double [10][3];
        double [] mediaAlunos = new double[10];
        for ( i = 0; i<notas.length;i++) {
			for ( j = 0; j<notas[i].length;j++) {
    		System.out.println("Informe a " + (j+1)+ "� nota do aluno" + (i+1)+": ");
            notas[i][j] = Integer.parseInt(teclado.nextLine());
            soma+= notas[i][j];
            mediaAlunos[i]+=notas[i][j];
           
            mediaFinal+=notas[i][j];
            
			}
			mediaAlunos[i] /= notas[i].length;
        }
			
			mediaFinal/=notas.length * notas[0].length;
        
			 for ( i = 0; i < notas.length; i++) { 
				 System.out.println("As notas do aluno " + (i+1)+ " s�o: " );
				 for ( j = 0; j<notas[i].length;j++) {
					 System.out.printf("%.1f ", notas[i][j]);
					}
					System.out.printf(" E a m�dia do aluno � %.1f", mediaAlunos[i]);
			 
			 System.out.println(" ");
			 }
			 System.out.println("O valor da m�dia final da turma �: "+ mediaFinal); 
			 }
			
        }
        
	


	

