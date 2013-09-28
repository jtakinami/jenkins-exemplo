package br.com.exemplo.jenkins.test;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

import br.com.exemplo.jenkins.Imposto;
import br.com.exemplo.jenkins.Orcamento;

public class ImpostoTest {
 
	@Test
	public void deveCalcularImpostoDeDezPorCento() {
		Orcamento orcamento = new Orcamento(100.0);
		Imposto imposto = new Imposto();
		assertEquals(12.0, imposto.calcula(orcamento), Double.MIN_VALUE);
	}
}
