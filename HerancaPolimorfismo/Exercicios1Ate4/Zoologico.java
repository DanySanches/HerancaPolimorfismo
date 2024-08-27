package com.Dani.HerancaPolimorfismo.Exercicios1Ate4;

public class Zoologico {

	private AnimalSelvagem[] jaulas;

	public Zoologico() {
		jaulas = new AnimalSelvagem[10];
		jaulas[0] = new Cobra("Cobra", 3);
		jaulas[1] = new Rinoceronte("Rinoceronte", 8);
		jaulas[2] = new Raposa("Raposa", 15);
		jaulas[3] = new Leao("Leão", 10);
		jaulas[4] = new Dromedario("Dromedário", 7);
		jaulas[5] = new Macaco("Macaco", 6);
		jaulas[6] = new Elefante("Elefante", 8);
		jaulas[7] = new Tigre("Tigre", 7);
		jaulas[8] = new Hipopotamo("Hipopótamo", 5);
		jaulas[9] = new Lobo("Lobo", 1);

	}

	public void percorrerJaulas() {
		for (AnimalSelvagem animal : jaulas) {
			System.out.println();
			animal.emitirSom();
			animal.correr();
			System.out.println();
		}

	}
}
