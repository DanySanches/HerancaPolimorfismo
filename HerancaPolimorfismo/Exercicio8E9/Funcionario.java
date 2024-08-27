package com.Dani.HerancaPolimorfismo.Exercicio8E9;

public class Funcionario {
	protected String nome;
	protected double salarioBase;
	protected double comissao;

	public Funcionario(String nome, double salarioBase, double comissao) {
		this.nome = nome;
		this.salarioBase = salarioBase;
		this.comissao = comissao;
	}

	public double calcularSalario() {
		return salarioBase + comissao; 
	}

	@Override
	public String toString() {
		return nome + " - Salário: R$ " + calcularSalario();
	}
}