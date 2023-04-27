package com.mycompany.exercicioingressos;

import java.text.NumberFormat;
import java.util.Locale;

/**
 * @author Gustavo H. Nava
 */
public class Ingresso {
    
    private float valor = 0;

    public Ingresso() {
    
    }
    
    public Ingresso(float valor) {
        this.valor = valor;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    @Override
    public String toString() {
        NumberFormat dinheiro = NumberFormat.getCurrencyInstance(new Locale("pt", "BR"));
        return dinheiro.format(valor);
    }
    
}
