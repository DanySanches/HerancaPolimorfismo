package com.Dani.HerancaPolimorfismo.Exercicios1Ate4;

public class Cachorro extends AnimalDomestico {

	public Cachorro(String nome, int idade) {
		super(nome, idade);

	}

	@Override
	public void emitirSom() {
		System.out.println(getNome() + " late");

	}

	@Override
	public void mover() {
		correr();

	}

}