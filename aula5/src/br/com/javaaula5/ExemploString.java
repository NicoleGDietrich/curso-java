package br.com.javaaula5;

public class ExemploString {
	
	public static void main (String []args) {
		
		String curso = "Java Web TranspoBrasil";
		
		//length() restorna a quantidade de caracteres
		System.out.println(curso.length());
		// charAt retorna o caracter em uma posição específica
		for (int posicao = 0; posicao < curso.length(); posicao++) {
			System.out.println(curso.charAt(posicao));
			
		}
		// indexOf() retorna o índice da String
		System.out.println(curso.indexOf("Web"));
		System.out.println(curso.indexOf("a",2));
		
		//o objeto String não é mutável
		String a = "bola";
		a = a.replace("o", "a");
		System.out.println(a);
		String b = "bola";
		String c = new String ("bola");
		System.out.println("a==b");
		System.out.println(a.equals(c));
		
		System.out.println(curso.substring(9));
		System.out.println(curso.substring(0,5));
	
		
		
			
		}

	}


