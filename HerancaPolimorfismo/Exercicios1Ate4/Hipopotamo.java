package com.Dani.HerancaPolimorfismo.Exercicios1Ate4;

public class Hipopotamo extends AnimalSelvagem {

	public Hipopotamo(String nome, int idade) {
		super(nome, idade);

	}

	@Override
	protected void emitirSom() {
		System.out.println("O som de " + getNome() + " é roncar");
	}

	@Override
	protected void mover() {
		correr();

	}

}
