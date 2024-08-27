package com.Dani.HerancaPolimorfismo.Exercicios1Ate4;

class Dromedario extends AnimalSelvagem {

	public Dromedario(String nome, int idade) {
		super(nome, idade);

	}

	@Override
	public void emitirSom() {
		System.out.println("O som de " + getNome() + " é balterar");
	}

	@Override
	protected void mover() {
		correr();

	}
}