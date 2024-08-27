package com.Dani.HerancaPolimorfismo.Exercicio11;

public class Funcionario {
    private String nome;
    private int codigo;
    private String escolaridade;
    private double rendaBase;

    public Funcionario(String nome, int codigo, double rendaBase) {
        this.nome = nome;
        this.codigo = codigo;
        this.rendaBase = rendaBase;
    }

    public double calcularRenda() {
        return rendaBase;
    }

    @Override
    public String toString() {
        return String.format("Nome: %s, Comissão: R$ %.2f, Salário Total: R$ %.2f",
                             nome, calcularComissao(), calcularRenda());
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getEscolaridade() {
        return escolaridade;
    }

    public void setEscolaridade(String escolaridade) {
        this.escolaridade = escolaridade;
    }

    public double calcularComissao() {
        return 0;
    }
}