package com.mycompany.exercicioingressos;

import java.text.NumberFormat;
import java.util.Locale;

/**
 * @author Gustavo H. Nava
 */
public class IngressoVIP extends Ingresso {
    
    private float valorAdiconal = 0;

    public IngressoVIP() {
        
    }
    
    public IngressoVIP(float valor, float valorAdicional) {
        super(valor);
        this.valorAdiconal = valorAdicional;
    }
    
    public float getValorAdiconal() {
        return valorAdiconal;
    }

    public void setValorAdiconal(float valorAdiconal) {
        this.valorAdiconal = valorAdiconal;
    }

    @Override
    public String toString() {
        NumberFormat dinheiro = NumberFormat.getCurrencyInstance(new Locale("pt", "BR"));
        return dinheiro.format(getValor()+valorAdiconal);
    }
    
}
