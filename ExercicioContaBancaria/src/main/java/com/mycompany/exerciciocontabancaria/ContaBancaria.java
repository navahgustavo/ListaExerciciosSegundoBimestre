package com.mycompany.exerciciocontabancaria;

import java.text.NumberFormat;
import java.util.Locale;

/**
 * @author Gustavo H. Nava
 */
public class ContaBancaria {
    
    protected String cliente;
    protected static int num_conta;
    protected float saldo;

    NumberFormat dinheiro = NumberFormat.getCurrencyInstance(new Locale("pt", "BR"));
    
    public ContaBancaria() {
    }

    public ContaBancaria(String cliente, float saldo) {
        this.cliente = cliente;
        this.saldo = saldo;
        num_conta++;
    }

    public static int getNum_conta() {
        return num_conta;
    }
    
    public void sacar(float saque) {
        if ((this.saldo - saque) >= 0) {
            float saldo_anterior = this.saldo;
            this.saldo =-saque;
            System.out.println("Quantia de "+ dinheiro.format(saque) +" sacada com sucesso.");
            System.out.println("Saldo anterior: " + dinheiro.format(saldo_anterior));
            System.out.println("Saldo atual: " + dinheiro.format(this.saldo));
        } else {
            System.out.println("Impossível completar a operação. Saldo disponível: " + dinheiro.format(this.saldo));
        }
    }
    
    public void depositar(float deposito) {
        if (deposito > 0) {
            float saldo_anterior = this.saldo;
            System.out.println("Quantia de "+ dinheiro.format(deposito) +" depositada com sucesso.");
            System.out.println("Saldo anterior: " + dinheiro.format(saldo_anterior));
            System.out.println("Saldo atual: " + dinheiro.format(this.saldo));
        } else {
            System.out.println("Impossível completar a operação. O valor do depósito não pode ser zerado ou negativo.");
        }
    }

    public String toString() {
        return "Conta Padrão" + "\nCliente: " + cliente + "\nNº Conta: " + num_conta + "\nSaldo Atual: " + dinheiro.format(saldo);
    }
    
    
    
}
