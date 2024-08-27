package com.Dani.HerancaPolimorfismo.Exercicios5Ate7;

public class Main {
	
    public static void main(String[] args) {
        Funcionario funcionario1 = new Funcionario("João", 123);
        FuncionarioEnsinoBasico funcionario2 = new FuncionarioEnsinoBasico("Maria", 456, "Escola Básica A");
        FuncionarioEnsinoMedio funcionario3 = new FuncionarioEnsinoMedio("Carlos", 789, "Escola Básica B", "Escola Médio X");
        FuncionarioGraduacao funcionario4 = new FuncionarioGraduacao("Ana", 101, "Escola Básica C", "Escola Médio Y", "Universidade Z");

        funcionario1.exibirInformacoes();
        System.out.println();
        
        funcionario2.exibirInformacoes();
        System.out.println();
        
        funcionario3.exibirInformacoes();
        System.out.println();
        
        funcionario4.exibirInformacoes();
    }
}
