package br.com.jpiassa.suites;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import br.com.jpiassa.servicos.CalculadoraTest;
import br.com.jpiassa.servicos.CalculoValorLocacaoTest;
import br.com.jpiassa.servicos.LocacaoServiceTest;

//@RunWith(Suite.class)
@SuiteClasses({
	CalculadoraTest.class,
	CalculoValorLocacaoTest.class,
	LocacaoServiceTest.class
})
public class SuiteExecucao {
	//Remova se puder!
}
