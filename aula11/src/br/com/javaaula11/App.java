package br.com.javaaula11;

public class App {
	
	public static void main(String[] args) {
		
		//toda classe definida torna-se um tipo
		
		Contato abacaxi = new Contato ();
		
		abacaxi.nome = "Jo�o";
		abacaxi.email = "jo�o@teste.com";
		abacaxi.telefone = "33221100";
		
		System.out.println(abacaxi.nome);
		System.out.println(abacaxi.email);
		System.out.println(abacaxi.telefone);
		
		abacaxi.configuraNome("Jo�o da Silva");  //m�todo ()
		System.out.println(abacaxi.retornaNome());
		System.out.println(abacaxi.nome);
		
		abacaxi.ligar();		
				
	}

}
