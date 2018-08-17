package br.com.jrpiassa.servicos;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import br.com.jrpiassa.exceptions.DividirPorZeroException;

public class CalculadoraTest {
	
	private Calculadora calc;
	@Before
	public void setUp(){
		calc = new Calculadora();
	}
	
	@Test
	public void should_be_sum(){
		//cenario
		int v1 = 1, v2 = 1;		
		
		//acao		
		int soma = calc.soma(v1, v2);
		
		//validacao		
		assertEquals(soma, 2);
	}
	
	@Test
	public void deve_subtrair(){
		//cenario
		int v1 =1, v2 =1;
		
		//acao
		int subtrair = calc.subtrair(v1, v2);
		
		//validacao
		assertEquals(0, subtrair);
	}
	
	@Test
	public void deveria_dividir() throws DividirPorZeroException{
		//cenario
		int v1=10, v2=2;
		
		//acao
		int divisao = calc.dividir(v1, v2);
		
		//validacao
		assertEquals(5, divisao);
	}
	
	@Test(expected = DividirPorZeroException.class)
	public void naoDividirPorZero() throws DividirPorZeroException{
		//cenario
		int v1=1, v2=0;		
		
		//acao
		int resultado = calc.dividir(v1, v2);		
	}
}
