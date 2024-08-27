package com.Dani.HerancaPolimorfismo.Exercicio8E9;

public class Gerente extends Funcionario {
	private static final double comissaoGerente = 1500.00;


	public Gerente(String nome, double salarioBase ) {
		super(nome, salarioBase, comissaoGerente);

	}
	@Override
	public double calcularSalario() {
		return salarioBase + comissaoGerente;
	}
}
