package com.Dani.HerancaPolimorfismo.Exercicios5Ate7;

public class FuncionarioEnsinoMedio extends FuncionarioEnsinoBasico {
	private String ensinoMedio;

	public FuncionarioEnsinoMedio(String nome, int codigoFuncional, String ensinoBasico, String ensinoMedio) {
		super(nome, codigoFuncional, ensinoBasico);
		this.ensinoMedio = ensinoMedio;

	}

	public String getEnsinoMedio() {
		return ensinoMedio;
	}

	public void setEnsinoMedio(String ensinoMedio) {
		this.ensinoMedio = ensinoMedio;
	}

	@Override
	public double calcularRenda() {
		return super.calcularRenda() * 1.50;
	}

	@Override
	public void exibirInformacoes() {
		super.exibirInformacoes();
		System.out.println("Escola Ensino Médio: " + ensinoMedio);
	}
}
