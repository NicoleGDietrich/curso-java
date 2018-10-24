package br.com.java.aula18;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CalculadoraDescontoTest {
	
	/*
	 * Crie uma calculadora de descontos seguindo as seguintes regras:
	 * Valores negativos devem retornar zero;
	 * Valores positivos até 1800 devem retornar exatamente o valor informado.
	 * Valores entre 1800,01 e 2400 devem retornar o valor informado aplicando um desconto
	 * de 5%.
	 * Valores entre 2400,01 e 3599,99 devem retornar o valor informado aplicando um desconto
	 * de 22%.
	 * Valores a partir de 3600 devem retornar o valor informado aplicando um desconto de 32%.
	 */

	
		private CalculadoraDesc calc;
		
		@Before
		public void antesDeCadaTest() {
			calc= new CalculadoraDesc();
		}
		
		@After
		public void depoisDeCadaTest() {
			System.out.println("Terminou mais um teste");
		}
		
		@Test
		
		public void testeNumeroNegativoMenosDez() {
			double resultado = calc.negativo(-10.0);
			Assert.assertEquals(0, resultado,0);
		}
		
        @Test
		
		public void testeNumeroPositivoMil() {
			double resultado = calc.positivoAte1800(1000.0);
			Assert.assertEquals(1000, resultado,0);
		}
        
        @Test
		
		public void testeNumero2350() {
			double resultado = calc.positivoEntre180001e2400(2350.0);
			Assert.assertEquals(2232.5, resultado,0);
		}
        
        @Test
		
		public void testeNumero3500() {
			double resultado = calc.positivoEntre240001e359999(3500.0);
			Assert.assertEquals(2730, resultado,0);
		}
        
        @Test
		
		public void testeNumero7000() {
			double resultado = calc.positivoAcimaDe3600(7000.0);
			Assert.assertEquals(4760, resultado,0);
		}
        
        @Test
		
		public void testeNumero2800() {
			double resultado = calc.positivoEntre240001e359999(2800.0);
			Assert.assertEquals(2184.0, resultado,0);
		}
		
}
