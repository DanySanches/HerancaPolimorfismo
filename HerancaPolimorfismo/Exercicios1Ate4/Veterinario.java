package com.Dani.HerancaPolimorfismo.Exercicios1Ate4;

public class Veterinario {

	public void examinar(Animal animal) {
		System.out.println("O veterinário está examinando o animal...");
		animal.emitirSom();
	}

}
