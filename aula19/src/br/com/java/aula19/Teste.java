package br.com.java.aula19;

public class Teste {
	
	public static int atributoStatic;
	public int atributo;
	
	public void oi() {
		System.out.println("OI!!");
		System.out.println("O valor do atributo � " + atributo);
		System.out.println("O valor do atributo est�tico � " + atributoStatic);
	}
	
	public static void hello() {
		System.out.println("Hello!!!");
	//	vari�veis de inst�ncia n�o podem ser chamadas diretamente em um m�todo est�tico
	//	System.out.println("O valor do atributo � " + atributo);
		System.out.println("O valor do atributo est�tico � " + atributoStatic);
		
		
	}

}
