package com.Dani.HerancaPolimorfismo.Exercicios1Ate4;

class Elefante extends AnimalSelvagem {

	public Elefante(String nome, int idade) {
		super(nome, idade);

	}

	@Override
	public void emitirSom() {
		System.out.println("O som de " + getNome() + " é berrar");
	}

	@Override
	protected void mover() {
		correr();

	}
}