package com.mycompany.exercicioempregados;

import java.text.NumberFormat;
import java.util.Locale;

/**
 * @author Gustavo H. Nava
 */
public class Vendedor extends Empregado{
    
    private float percentualComissao;

    public Vendedor() {
    }

    public Vendedor(String nome, float salario, float percentualComissao) {
        super(nome, salario);
        this.percentualComissao = percentualComissao;
    }    
    
    public float getPercentualComissao() {
        return percentualComissao;
    }

    public void setPercentualComissao(float percentualComissao) {
        this.percentualComissao = percentualComissao;
    }
    
    public float calcularSalario() {
        float percentual = this.percentualComissao/100;
        float valorComissao = salario*percentual;
        return salario+valorComissao;
    }
    
    public String toString() {
        NumberFormat dinheiro = NumberFormat.getCurrencyInstance(new Locale("pt", "BR"));
        return "Vendedor"+ "\nNome: "+ getNome() + "\nSalario S/ Comissao: " + dinheiro.format(salario) 
                + "\nPercentual Comissao: " + percentualComissao + "%\nSalario C/ Comissao: " + dinheiro.format(calcularSalario());
    }
            
}
