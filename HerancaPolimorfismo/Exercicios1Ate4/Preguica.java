package com.Dani.HerancaPolimorfismo.Exercicios1Ate4;

public class Preguica extends AnimalSilvestre {

	public Preguica(String nome, int idade) {
		super(nome, idade);

	}

	@Override
	public void emitirSom() {
		System.out.println(getNome() + " grita");

	}

	@Override
	public void mover() {
		subirEmArvore();
	}

}