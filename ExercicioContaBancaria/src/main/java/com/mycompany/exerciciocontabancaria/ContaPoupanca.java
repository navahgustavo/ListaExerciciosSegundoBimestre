package com.mycompany.exerciciocontabancaria;

import java.text.NumberFormat;
import java.util.Locale;

/**
 * @author Gustavo H. Nava
 */
public class ContaPoupanca extends ContaBancaria {
    
    protected int dia_rendimento;

    public ContaPoupanca() {
    }

    public ContaPoupanca(String cliente, float saldo, int dia_rendimento) {
        super(cliente, saldo);
        num_conta++;
        this.dia_rendimento = dia_rendimento;
    }
    
    public void calcularNovoSaldo(float taxa_rendimento) {
        float percentual = taxa_rendimento/100;
        float valor_rendimento = this.saldo*percentual;
        this.saldo =+ valor_rendimento; 
    }

    public String toString() {
        return "Conta Poupanca" + "\nCliente: " + cliente + "\nNº Conta: " + num_conta + "\nSaldo Atual: " + dinheiro.format(saldo) 
                + "\nDia do Rendimento: " + dia_rendimento;
    }
    
}
