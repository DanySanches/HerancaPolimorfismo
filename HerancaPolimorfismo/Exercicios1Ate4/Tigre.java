package com.Dani.HerancaPolimorfismo.Exercicios1Ate4;

class Tigre extends AnimalSelvagem {

	public Tigre(String nome, int idade) {
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