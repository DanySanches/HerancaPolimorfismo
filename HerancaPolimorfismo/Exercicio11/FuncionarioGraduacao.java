package com.Dani.HerancaPolimorfismo.Exercicio11;

public class FuncionarioGraduacao extends Funcionario {
    private String escolaBasica;
    private String escolaMedia;
    private String universidade;

    public FuncionarioGraduacao(String nome, int codigo, String escolaBasica, String escolaMedia, String universidade) {
        super(nome, codigo, 1000); 
        this.escolaBasica = escolaBasica;
        this.escolaMedia = escolaMedia;
        this.universidade = universidade;
    }

    @Override
    public double calcularRenda() {
        return super.calcularRenda() * 2.00; 
    }

    @Override
    public double calcularComissao() {
        return 0;
    }

    @Override
    public String toString() {
        return super.toString() + String.format(", Escola Básica: %s, Escola Médio: %s, Universidade: %s",
                                                 escolaBasica, escolaMedia, universidade);
    }
}
