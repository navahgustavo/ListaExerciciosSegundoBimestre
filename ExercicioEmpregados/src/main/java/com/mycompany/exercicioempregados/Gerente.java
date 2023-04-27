package com.mycompany.exercicioempregados;

import java.text.NumberFormat;
import java.util.Locale;

/**
 * @author Gustavo H. Nava
 */
public class Gerente extends Empregado{
    
    private String departamento;

    public Gerente() {
    }
    
    public Gerente(String nome, float salario, String departamento) {
        super(nome, salario);
        this.departamento = departamento;
    }
    
    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public String toString() {
        NumberFormat dinheiro = NumberFormat.getCurrencyInstance(new Locale("pt", "BR"));
        return "Gerente"+ "\nNome: "+ getNome() + "\nSalario: " + dinheiro.format(salario) + "\nDepartamento: " + departamento;
    }
    
}
