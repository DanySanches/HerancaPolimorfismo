package com.Dani.HerancaPolimorfismo.Exercicios1Ate4;

public abstract class AnimalSelvagem extends Animal {

	public AnimalSelvagem(String nome, int idade) {
		super(nome, idade);
	}

	public void correr() {
		System.out.println(getNome() + " está correndo.");
	}

}
