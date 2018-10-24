package br.com.java.aula21.lambda;

public class ExemploLambda {
	public static void main(String[] args) {
		
	
	
	Voador v1 = new Aviao ();
	v1.voar();
	
	Voador v2 = ()-> {System.out.println("Voador Lambda1 Voando");};
	Voador v3 = ()-> System.out.println("Voador Lambda2 Voando");;
	
	v2.voar();
	liberarVoo(v1);
	liberarVoo(v2);
	liberarVoo(v3);
    liberarVoo(() -> System.out.println("Voador Lambda3 Voando..."));
    
    Voador v = new Voador() {
    	public void voar() {
    		System.out.println("Faz alguma coisa");
    	}
    };
    
    Voador vl = () ->System.out.println("Faz alguma coisa");
    };



private static void liberarVoo(Voador voador) {
	voador.voar();
}

}
