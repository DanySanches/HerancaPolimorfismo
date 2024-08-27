package com.Dani.HerancaPolimorfismo.Exercicios1Ate4;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        
        AnimalDomestico cachorro = new Cachorro("Mel", 5);
        AnimalDomestico cavalo = new Cavalo("Spirit", 8);
        AnimalSilvestre preguica = new Preguica("Sid", 3);
        Veterinario veterinario = new Veterinario();
        Zoologico zoologico = new Zoologico();

       
        List<Animal> animais = new ArrayList<>();
        animais.add(cachorro);
        animais.add(cavalo);
        animais.add(preguica);

        
        for (Animal animal : animais) {
        	System.out.println("Sons dos animais");
            System.out.println();
            System.out.println(animal.getNome() + " está emitindo som:");
            animal.emitirSom();  // Chamada polimórfica
            System.out.println();
        }
        
        System.out.println("Indo no Veterinário");
        System.out.println();
        
        veterinario.examinar(cachorro);
        System.out.println();
        veterinario.examinar(cavalo);
        System.out.println();
        veterinario.examinar(preguica);
        System.out.println();
        
        
        System.out.println("Andando no Zoologico");
        System.out.println();
        zoologico.percorrerJaulas();
        System.out.println();
    }

}
