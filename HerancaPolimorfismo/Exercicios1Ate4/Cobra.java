package com.Dani.HerancaPolimorfismo.Exercicios1Ate4;

class Cobra extends AnimalSelvagem {

	public Cobra(String nome, int idade) {
		super(nome, idade);

	}

	@Override
	public void emitirSom() {
		System.out.println("O som de " + getNome() + " sibilar");
	}

	@Override
	public void mover() {
		System.out.println(getNome() + " não anda e sim rasteja");
	}

}