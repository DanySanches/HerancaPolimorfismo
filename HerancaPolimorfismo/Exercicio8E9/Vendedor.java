package com.Dani.HerancaPolimorfismo.Exercicio8E9;

public class Vendedor extends Funcionario {
    private static final double comissaoVendedor = 250.00;

    public Vendedor(String nome, double salarioBase) {
        super(nome, salarioBase, comissaoVendedor);
    }

    @Override
    public double calcularSalario() {
        return salarioBase + comissaoVendedor;
    }
}