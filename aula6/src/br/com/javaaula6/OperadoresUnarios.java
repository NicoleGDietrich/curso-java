package br.com.javaaula6;

public class OperadoresUnarios {
	
	public static void main (String [] args) {
		
		/**
		 * Operadores Un�rios
		 * ++
		 * --
		 * Pr�-incremento
		 */
		
		int numero = 10;
		System.out.println("PR� INCREMENTO");
		System.out.println(numero);
		System.out.println(++numero);
		System.out.println(numero);
		
		int numero2 = 20;
		System.out.println("P�S INCREMENTO");
		System.out.println(numero2);
		System.out.println(numero2++);
		System.out.println(numero2);
		
		int res = numero++;
		System.out.println(res==numero);
		int numeros[] = {1,2,3,4,5};
		int i = 0;
		while (i< numeros.length) {
			System.out.println(numeros[i++]);
		}
		
		int n1 = 10;
		System.out.println("PR� DECREMENTO");
		System.out.println(n1);
		System.out.println(--n1);
		System.out.println(n1);
		
		int n2 = 20;
		System.out.println("P�S DECREMENTO");
		System.out.println(n2);
		System.out.println(n2--);
		System.out.println(n2);
		
		
		
				
	}

}
