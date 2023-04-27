package com.mycompany.exercicioempregados;

import java.text.NumberFormat;
import java.util.Locale;

/**
 * @author Gustavo H. Nava
 */
public class Empregado {

    private String nome;
    protected float salario;

    public Empregado() {
    }

    public Empregado(String pnome, float salario) {
        this.nome = pnome;
        this.salario = salario;
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String toString() {
        NumberFormat dinheiro = NumberFormat.getCurrencyInstance(new Locale("pt", "BR"));
        return "Empregado" + "\nNome: " + nome + "\nSalario: " + dinheiro.format(salario);
    }
    
}
