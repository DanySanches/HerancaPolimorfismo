package com.Dani.HerancaPolimorfismo.Exercicios1Ate4;

public class Rinoceronte extends AnimalSelvagem {

	public Rinoceronte(String nome, int idade) {
		super(nome, idade);

	}

	@Override
	protected void emitirSom() {
		System.out.println("O som de " + getNome() + " é bufar");

	}

	@Override
	protected void mover() {
		correr();

	}

}
