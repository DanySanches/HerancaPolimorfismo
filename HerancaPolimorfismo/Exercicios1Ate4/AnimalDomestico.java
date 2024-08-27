package com.Dani.HerancaPolimorfismo.Exercicios1Ate4;

public abstract class AnimalDomestico extends Animal {

	public AnimalDomestico(String nome, int idade) {
		super(nome, idade);

	}

	public void correr() {
		System.out.println(getNome() + "  está correndo.");
	}

}
