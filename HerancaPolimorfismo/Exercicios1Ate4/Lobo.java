package com.Dani.HerancaPolimorfismo.Exercicios1Ate4;

public class Lobo extends AnimalSelvagem {

	public Lobo(String nome, int idade) {
		super(nome, idade);

	}

	@Override
	protected void emitirSom() {
		System.out.println("O som de " + getNome() + " é uivar");

	}

	@Override
	protected void mover() {
		correr();

	}

}
