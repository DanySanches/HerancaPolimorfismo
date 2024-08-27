package com.Dani.HerancaPolimorfismo.Exercicios1Ate4;

class Leao extends AnimalSelvagem {

	public Leao(String nome, int idade) {
		super(nome, idade);

	}

	@Override
	public void emitirSom() {
		System.out.println("O som de " + getNome() + " é rugir");
	}

	@Override
	protected void mover() {
		correr();

	}
}