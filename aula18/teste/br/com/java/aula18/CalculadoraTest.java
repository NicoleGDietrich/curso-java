package br.com.java.aula18;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CalculadoraTest {
	
	private Calculadora calc;
	
	@Before
	public void antesDeCadaTest() {
		calc = new Calculadora();
	}
	
	@After
	public void depoisDeCadaTest() {
		System.out.println("Terminou mais um teste");
	}
	
	@Test
	
	public void testSomarDoisMaisDois() {
		double resultado = calc.somar(2.0, 2.0);
		Assert.assertEquals(4.0, resultado,0);
		//Assert.fail("Teste somar ainda não implementado");
		
	}
	
	@Test
	
	public void testeSomarDoisMaisTres() {
		double resultado = calc.somar(2.0, 3.0);
		Assert.assertEquals(5.0, resultado,0);
	}
	
    @Test
	
	public void testeSomarCincoMaisVinte() {
		double resultado = calc.somar(5.0, 20.0);
		Assert.assertEquals(25.0, resultado,0);
}
    
    @Test
    
    public void testeSubtrair10Menos3() {
		double resultado = calc.subtrair(10.0, 3.0);
		Assert.assertEquals(7.0, resultado,0);
    }
}
