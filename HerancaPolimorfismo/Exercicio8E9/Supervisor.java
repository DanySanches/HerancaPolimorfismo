package com.Dani.HerancaPolimorfismo.Exercicio8E9;

public class Supervisor extends Funcionario {
    private static final double comissaoSupervisor = 600.00;

    public Supervisor(String nome, double salarioBase) {
        super(nome, salarioBase, comissaoSupervisor);
    }

    @Override
    public double calcularSalario() {
        return salarioBase + comissaoSupervisor;
    }
}