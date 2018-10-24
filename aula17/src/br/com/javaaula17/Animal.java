package br.com.javaaula17;

public abstract class Animal {
	
	public abstract void comer();
	
	public void respirar() {
		System.out.println(this.getClass().getSimpleName()+" respirando Oxigênio");
	}

}
