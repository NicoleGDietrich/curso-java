package br.com.javaaula6;

public class ExemploWhile {
	
	public static void main(String[] args) {
		
		int numero = 10;
		
		while (numero <= 20) {
			if(numero%2==0) {
				numero++;
				continue;
			}
			System.out.println((++numero) + ", ");
		}
		
		System.out.println("");
		System.out.println(numero);
		System.out.println("Fim da Aplicação");
	}

}
