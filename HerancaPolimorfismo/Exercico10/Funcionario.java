package com.Dani.HerancaPolimorfismo.Exercico10;

public class Funcionario {
    private String nome;
    private double salarioBase;
    private String escolaridade;
    private double comissao;

    public Funcionario(String nome, double salarioBase, double comissao) {
        this.setNome(nome);
        this.salarioBase = salarioBase;
        this.comissao = comissao;
    }

    public double calcularSalario() {
        return salarioBase + comissao;
    }

    public String getEscolaridade() {
        return escolaridade;
    }

    public void setEscolaridade(String escolaridade) {
        this.escolaridade = escolaridade;
    }

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	
}