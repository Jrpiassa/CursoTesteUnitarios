package br.com.jrpiassa.servicos;


import java.util.Date;

import org.junit.Assert;
import org.junit.Test;

import br.com.jrpiassa.entidades.Filme;
import br.com.jrpiassa.entidades.Locacao;
import br.com.jrpiassa.entidades.Usuario;
import br.com.jrpiassa.servicos.LocacaoService;
import br.com.jrpiassa.utils.DataUtils;

public class LocacaoServiceTest {
	@Test
	public void when_alugarFilme_then_should_true() {
		/**
		 * Cenário
		 */
		LocacaoService service = new LocacaoService();
		Usuario usuario = new Usuario("Usuario 1");
		Filme filme = new Filme("Filme 1", 2, 5.0);
		/**
		 * Ação
		 */
		Locacao locacao = service.alugarFilme(usuario, filme);
		/**
		 * Verificação
		 */
		Assert.assertTrue(locacao.getValor()== 5.0);
		Assert.assertTrue(DataUtils.isMesmaData(locacao.getDataLocacao(), new Date()));
		Assert.assertTrue(DataUtils.isMesmaData(locacao.getDataRetorno(), DataUtils.obterDataComDiferencaDias(1)));
	}
}
