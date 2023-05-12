package com.mycompany.exercicioredefinicao;

/**
 * @author Gustavo H. Nava
 */
public class ExercicioRedefinicao {

    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.fazerBarulho();
        
        Cachorro cachorro = new Cachorro();
        cachorro.fazerBarulho();
        
        Gato gato = new Gato();
        gato.fazerBarulho();
    }
}
