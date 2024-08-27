package com.Dani.HerancaPolimorfismo.Exercicios5Ate7;

public class FuncionarioGraduacao extends FuncionarioEnsinoMedio {

	public FuncionarioGraduacao(String nome, int codigoFuncional, String escolaBasico, String escolaMedio,
			String universidade) {
		super(nome, codigoFuncional, escolaBasico, escolaMedio);
		this.universidade = universidade;
	}

	private String universidade;

	public String getUniversidade() {
		return universidade;
	}

	public void setUniversidade(String universidade) {
		this.universidade = universidade;
	}

	@Override
	public double calcularRenda() {
		return super.calcularRenda() * 2.00;
	}

	@Override
	public void exibirInformacoes() {
		super.exibirInformacoes();
		System.out.println("Universidade: " + universidade);
	}

}
