package com.Dani.HerancaPolimorfismo.Exercicios5Ate7;

public class Exercicio7 {
    public static void main(String[] args) {
    
        Funcionario[] funcionarios = new Funcionario[10];

       
        // 4 funcionários com ensino básico (40%)
        funcionarios[0] = new FuncionarioEnsinoBasico("João", 1, "Escola Básica A");
        funcionarios[1] = new FuncionarioEnsinoBasico("Maria", 2, "Escola Básica B");
        funcionarios[2] = new FuncionarioEnsinoBasico("José", 3, "Escola Básica C");
        funcionarios[3] = new FuncionarioEnsinoBasico("Ana", 4, "Escola Básica D");

        // 4 funcionários com ensino médio (40%)
        funcionarios[4] = new FuncionarioEnsinoMedio("Carlos", 5, "Escola Básica E", "Escola Médio A");
        funcionarios[5] = new FuncionarioEnsinoMedio("Fernanda", 6, "Escola Básica F", "Escola Médio B");
        funcionarios[6] = new FuncionarioEnsinoMedio("Pedro", 7, "Escola Básica G", "Escola Médio C");
        funcionarios[7] = new FuncionarioEnsinoMedio("Clara", 8, "Escola Básica H", "Escola Médio D");

        // 2 funcionários com ensino suoerior (20%)
        funcionarios[8] = new FuncionarioGraduacao("Lucas", 9, "Escola Básica I", "Escola Médio E", "Universidade X");
        funcionarios[9] = new FuncionarioGraduacao("Mariana", 10, "Escola Básica J", "Escola Médio F", "Universidade Y");

    
        double custoTotal = 0;
        double custoBasico = 0;
        double custoMedio = 0;
        double custoSuperior = 0;

       
        for (Funcionario funcionario : funcionarios) {
            double salario = funcionario.calcularRenda();
            custoTotal += salario;

            
            if (funcionario instanceof FuncionarioGraduacao) {
                custoSuperior += salario;
            } else if (funcionario instanceof FuncionarioEnsinoMedio) {
                custoMedio += salario;
            } else if (funcionario instanceof FuncionarioEnsinoBasico) {
                custoBasico += salario;
            }
        }

        System.out.printf("Custo total com salários: R$ %.2f%n", custoTotal);
        System.out.printf("Custo com funcionários de ensino básico: R$ %.2f%n", custoBasico);
        System.out.printf("Custo com funcionários de ensino médio: R$ %.2f%n", custoMedio);
        System.out.printf("Custo com funcionários de nível superior: R$ %.2f%n", custoSuperior);
    }
}
