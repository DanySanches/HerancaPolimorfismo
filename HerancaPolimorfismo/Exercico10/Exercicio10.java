package com.Dani.HerancaPolimorfismo.Exercico10;

public class Exercicio10 {

	public static void main(String[] args) {
		Gerente[] gerentes = new Gerente[1];
		Supervisor[] supervisores = new Supervisor[2];
		Vendedor[] vendedores = new Vendedor[7];

		gerentes[0] = new Gerente("Alice", 5000.00, 1500.00);

		supervisores[0] = new Supervisor("Bruno", 3500.00, 600.00);
		supervisores[1] = new Supervisor("Carla", 3500.00, 600.00);

		vendedores[0] = new Vendedor("David", 2000.00, 250.00);
		vendedores[1] = new Vendedor("Eva", 2000.00, 250.00);
		vendedores[2] = new Vendedor("Felipe", 2000.00, 250.00);
		vendedores[3] = new Vendedor("Gustavo", 2000.00, 250.00);
		vendedores[4] = new Vendedor("Helena", 2000.00, 250.00);
		vendedores[5] = new Vendedor("Isabela", 2000.00, 250.00);
		vendedores[6] = new Vendedor("João", 2000.00, 250.00);

		gerentes[0].setEscolaridade("Nível Superior");

		supervisores[0].setEscolaridade("Ensino Médio");
		supervisores[1].setEscolaridade("Ensino Médio");

		vendedores[0].setEscolaridade("Ensino Básico");
		vendedores[1].setEscolaridade("Ensino Médio");
		vendedores[2].setEscolaridade("Ensino Básico");
		vendedores[3].setEscolaridade("Ensino Básico");
		vendedores[4].setEscolaridade("Ensino Médio");
		vendedores[5].setEscolaridade("Nível Superior");
		vendedores[6].setEscolaridade("Ensino Básico");

		double custoTotal = 0;
		double custoEnsinoBasico = 0;
		double custoEnsinoMedio = 0;
		double custoNivelSuperior = 0;

		for (Funcionario funcionario : vendedores) {
			double salario = funcionario.calcularSalario();
			custoTotal += salario;

			switch (funcionario.getEscolaridade()) {
			case "Ensino Básico":
				custoEnsinoBasico += salario;
				break;
			case "Ensino Médio":
				custoEnsinoMedio += salario;
				break;
			case "Nível Superior":
				custoNivelSuperior += salario;
				break;
			}
		}

		System.out.println("Custo total da empresa com salários: R$ " + custoTotal);
		System.out.println("Custo total com funcionários de Ensino Básico: R$ " + custoEnsinoBasico);
		System.out.println("Custo total com funcionários de Ensino Médio: R$ " + custoEnsinoMedio);
		System.out.println("Custo total com funcionários de Nível Superior: R$ " + custoNivelSuperior);
	}
}
