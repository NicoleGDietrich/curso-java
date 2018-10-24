package br.com.javaaula11;

public class App {
	
	public static void main(String[] args) {
		
		//toda classe definida torna-se um tipo
		
		Contato abacaxi = new Contato ();
		
		abacaxi.nome = "João";
		abacaxi.email = "joão@teste.com";
		abacaxi.telefone = "33221100";
		
		System.out.println(abacaxi.nome);
		System.out.println(abacaxi.email);
		System.out.println(abacaxi.telefone);
		
		abacaxi.configuraNome("João da Silva");  //método ()
		System.out.println(abacaxi.retornaNome());
		System.out.println(abacaxi.nome);
		
		abacaxi.ligar();		
				
	}

}
