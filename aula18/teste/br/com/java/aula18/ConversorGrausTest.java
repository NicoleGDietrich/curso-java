package br.com.java.aula18;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ConversorGrausTest {
	
	/*
	 * 1) Crie um conversor entre graus Celsius e Fahrenheit, o conversor deve ter opções de 
	 * realizar a conversão entre quaisquer um dos dois tipos de escala. O desenvolvimento deve
	 * ser realizado utilizando os conceitos de TDD.
	 */
	
	private Conversor conv;
	
	@Before
	public void antesDeCadaTest() {
		conv = new Conversor();
	}
	
	@After
	public void depoisDeCadaTest() {
		System.out.println("Terminou mais um teste");
	}
	
    @Test
	
	public void testConverter30GrausCelsiusEmFahrenheit() {
		double resultado = conv.converterCelsiusEmFahrenheit(30.0);
		Assert.assertEquals(86.0, resultado,0);
    }
    
    @Test
    public void testConverter86GrausFahrenheitEmCelsius() {
		double resultado = conv.converterFahrenheitEmCelsius(86.0);
		Assert.assertEquals(30.0, resultado,0);
    }
}
