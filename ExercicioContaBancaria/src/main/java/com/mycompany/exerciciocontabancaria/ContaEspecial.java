package com.mycompany.exerciciocontabancaria;
/**
 * @author Gustavo H. Nava
 */
public class ContaEspecial extends ContaBancaria{
    
    protected float limite;
    
    public ContaEspecial() {
    }

    public ContaEspecial(String cliente, float saldo, float limite) {
        super(cliente, saldo);
        num_conta++;
        this.limite = limite;
    }
    
    @Override
    public void sacar(float saque) {
        if ((this.saldo - saque) >= (0 - limite)) {
            float saldo_anterior = 0;
            if (this.saldo > 0) {
                saldo_anterior = this.saldo;
            }
            if ((this.saldo > 0) && ((this.saldo-saque) >= 0)) {
                this.saldo =-saque;
                System.out.println("Quantia de "+ dinheiro.format(saque) +" sacada com sucesso.");
                System.out.println("Saldo anterior: " + dinheiro.format(saldo_anterior));
                System.out.println("Saldo atual: " + dinheiro.format(this.saldo));
            } else if ((this.saldo > 0) && ((this.saldo-saque) < 0)) {
                this.saldo =-saque;
                this.limite = this.limite-this.saldo;
                System.out.println("Quantia de "+ dinheiro.format(saque) +" sacada com sucesso.");
                System.out.println("Saldo anterior: " + dinheiro.format(saldo_anterior));
                this.saldo = 0;
                System.out.println("Saldo atual: " + dinheiro.format(this.saldo));
            } else if (this.saldo == 0) {
                this.limite = this.limite-saque;
                System.out.println("Quantia de "+ dinheiro.format(saque) +" sacada com sucesso.");
                System.out.println("Saldo anterior: " + dinheiro.format(saldo_anterior));
                System.out.println("Saldo atual: " + dinheiro.format(this.saldo));
            }
            System.out.println("Limite: " + dinheiro.format(this.limite));
        } else {
            System.out.println("Impossível completar a operação. Saldo disponível: " + dinheiro.format(this.saldo));
        }
    }
    
    public String toString() {
        return "Conta Especial" + "\nCliente: " + cliente + "\nNº Conta: " + num_conta 
                + "\nSaldo Atual: " + dinheiro.format(saldo) + "\nLimite disponível: " + dinheiro.format(limite);
    }
    
}
