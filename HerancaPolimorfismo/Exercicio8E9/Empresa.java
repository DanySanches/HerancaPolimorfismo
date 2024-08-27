package com.Dani.HerancaPolimorfismo.Exercicio8E9;

public class Empresa {
    public static void main(String[] args) {
      
        Funcionario gerente = (Funcionario) new Gerente("Alice", 5000.00);
        Funcionario supervisor = (Funcionario) new Supervisor("Bruno", 3500.00);
        Funcionario vendedor = (Funcionario) new Vendedor("Carla", 2000.00);

        System.out.println(gerente);
        System.out.println(supervisor);
        System.out.println(vendedor);
    }
}
