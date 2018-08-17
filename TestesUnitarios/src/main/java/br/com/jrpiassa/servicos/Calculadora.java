package br.com.jrpiassa.servicos;

import br.com.jrpiassa.exceptions.DividirPorZeroException;

public class Calculadora {
	protected int soma(int v1, int v2){
		return v1 + v2;
	}

	public int subtrair(int v1, int v2) {
		return v1 - v2;
	}

	public int dividir(int v1, int v2) throws DividirPorZeroException {
		if(v2 == 0){
			throw new DividirPorZeroException();
		}
		return v1 / v2;
	}
}
