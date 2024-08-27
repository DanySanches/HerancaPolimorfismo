package com.Dani.HerancaPolimorfismo.Exercicios1Ate4;

public abstract class Animal {

	private String nome;
	private int idade;

	public Animal(String nome, int idade) {
		this.nome = nome;
		this.idade = idade;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	// Métodos para todos animais
	protected abstract void emitirSom();

	protected abstract void mover();

}
