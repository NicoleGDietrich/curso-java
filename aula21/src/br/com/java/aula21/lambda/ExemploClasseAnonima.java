package br.com.java.aula21.lambda;

public class ExemploClasseAnonima {
	
	public static void main(String[] args) {
		
		Voador v1 = new Aviao ();
		v1.voar();
		
		Voador v2 = new Voador () {
			public void voar() {
				System.out.println("Voador An�nimo...");
			}
		};
		
		v2.voar();
		liberarVoo(v1);
		liberarVoo(v2);
		liberarVoo(new Voador() {
			public void voar() {
				System.out.println("Vaodor An�nimo 2...");
			}
		});
	}

	
	private static void liberarVoo(Voador voador) {
		voador.voar();
	}
}
