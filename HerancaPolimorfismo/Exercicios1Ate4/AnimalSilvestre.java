package com.Dani.HerancaPolimorfismo.Exercicios1Ate4;

public abstract class AnimalSilvestre extends Animal {

	public AnimalSilvestre(String nome, int idade) {
		super(nome, idade);
	}

	public void subirEmArvore() {
		System.out.println(getNome() + " está subindo a árvore.");
	}

}
