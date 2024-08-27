package com.Dani.HerancaPolimorfismo.Exercicios1Ate4;

class Macaco extends AnimalSelvagem {

	public Macaco(String nome, int idade) {
		super(nome, idade);

	}

	@Override
	public void emitirSom() {
		System.out.println("O som de " + getNome() + " é guinchar");
	}

	@Override
	protected void mover() {
		correr();

	}
}
