package br.com.java.aula18;

public class Conversor {
	
	public double converterCelsiusEmFahrenheit(double numero) {
		return 1.8 * numero + 32;
	}
	
	public double converterFahrenheitEmCelsius(double numero) {
		return (numero - 32.0) / 1.8;
	}
}



