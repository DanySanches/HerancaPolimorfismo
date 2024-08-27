package com.Dani.HerancaPolimorfismo.Exercicio11;

public class FuncionarioEnsinoMedio extends Funcionario {
	private String escolaBasica;
	private String escolaMedia;

	public FuncionarioEnsinoMedio(String nome, int codigo, String escolaBasica, String escolaMedia) {
		super(nome, codigo, 1000);
		this.escolaBasica = escolaBasica;
		this.escolaMedia = escolaMedia;
	}

	@Override
	public double calcularRenda() {
		return super.calcularRenda() * 1.50; 
	}

	@Override
	public double calcularComissao() {
		return 0;
	}

	@Override
	public String toString() {
		return super.toString() + String.format(", Escola Básica: %s, Escola Médio: %s", escolaBasica, escolaMedia);
	}
}
