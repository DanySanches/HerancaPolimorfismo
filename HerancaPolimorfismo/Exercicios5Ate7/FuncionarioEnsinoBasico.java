package com.Dani.HerancaPolimorfismo.Exercicios5Ate7;

public class FuncionarioEnsinoBasico extends Funcionario {
	private String ensinoBasico;

	public FuncionarioEnsinoBasico(String nome, int codigoFuncional, String ensinoBasico) {
		super(nome, codigoFuncional);
		this.ensinoBasico = ensinoBasico;
	}

	public String getEscolaBasico() {
		return ensinoBasico;
	}

	@Override
	public double calcularRenda() {
		return super.calcularRenda() * 1.10; 
	}

	@Override
	public void exibirInformacoes() {
		super.exibirInformacoes();
		System.out.println("Escola Ensino Básico: " + ensinoBasico);
	}
}
