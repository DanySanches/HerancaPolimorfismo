package com.Dani.HerancaPolimorfismo.Exercicios1Ate4;

public class Cavalo extends AnimalDomestico {

	public Cavalo(String nome, int idade) {
		super(nome, idade);

	}

	@Override
	public void emitirSom() {
		System.out.println(getNome() + " Relincha");

	}

	@Override
	public void mover() {
		correr();

	}

}
