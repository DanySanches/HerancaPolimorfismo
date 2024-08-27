package com.Dani.HerancaPolimorfismo.Exercicio11;

public class FuncionarioEnsinoBasico extends Funcionario {
	private String escola;

	public FuncionarioEnsinoBasico(String nome, int codigo, String escola) {
		super(nome, codigo, 1000);
		this.escola = escola;
	}

	@Override
	public double calcularRenda() {
		return super.calcularRenda() * 1.10;
	}

	@Override
	public double calcularComissao() {
		return 0;
	}

	@Override
	public String toString() {
		return super.toString() + String.format(", Escola: %s", escola);
	}
}
