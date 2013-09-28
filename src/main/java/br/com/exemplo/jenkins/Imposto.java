package br.com.exemplo.jenkins;

public class Imposto {

	public Imposto() {
	} 

	public double calcula(Orcamento orcamento) {
		System.out.println("teste-jenkins");
		return orcamento.getValor() * 0.2;
	}

}
