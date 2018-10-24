package br.com.ifc;

import java.util.Scanner;

public class Exercicio3 {
	
	/**
	 * Faça um programa que converta uma quantidade de tempo em segundos para uma quantidade
	 *  de tempo em anos, meses, dias, horas, minutos e segundos. Considere meses com 30 dias 
	 *  e anos com 12 meses. Exemplo: 1234567890 segundos possuem 39 anos, 8 meses, 8 dias, 
	 *  23 horas, 31 minutos e 30 segundos.
	 */
	
	public static void main(String[] args) {
		
	   Scanner teclado = new Scanner(System.in);
		System.out.println("Digite uma quantidade de tempo em segundos");
		double seg = Double.parseDouble(teclado.nextLine());
		
		int anos = (int) (seg /  31536000);
		double restoAnos = seg %  31536000;
		int meses = (int) (restoAnos / 2592000);
		double restoMeses = restoAnos % 2592000;
		int dias = (int) (restoMeses / 86400);
		double restoDias = restoMeses % 86400;
		int horas = (int) (restoDias / 3600);
		double restoHoras = restoDias % 3600;
		int min = (int) (restoHoras / 60);
		double restoMin = restoHoras % 60;
		double seg2 = restoMin;
		
		System.out.println("Equivale a: " + anos+" anos " + meses+ " meses "+ dias+ " dias "+horas+ " horas " +min+ " minutos e " + seg2 + " segundos" );
		teclado.close(); 
		
		
		
		
		
		
		
		
		
		
		
	}

}
