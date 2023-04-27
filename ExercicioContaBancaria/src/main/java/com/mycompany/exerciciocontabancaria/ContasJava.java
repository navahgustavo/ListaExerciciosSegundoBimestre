package com.mycompany.exerciciocontabancaria;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author Gustavo H. Nava
 */
public class ContasJava {

    static List<ContaBancaria> contas = new ArrayList<>();
    
    public static void main(String[] args) {
        
        Scanner ler = new Scanner(System.in);
        int escolha = -1;
        
        System.out.println("-----------------------------------------");
        System.out.println(" || Banco ||");
        System.out.println("-----------------------------------------");
        
        do {            
            System.out.println("-----------------------------------------");
            System.out.println("Escolha a opção desejada.");
            System.out.println("1 - Cadastro Conta Padrão");
            System.out.println("2 - Cadastro Conta Poupança");
            System.out.println("3 - Cadastro Conta Especial");
            System.out.println("4 - Depósitos");
            System.out.println("5 - Depósitos");
            System.out.println("6 - Rendimentos");
            System.out.println("7 - Consultar cadastro");
            System.out.println("0 - Sair");
            System.out.println("-----------------------------------------");
            
            if (ler.hasNextInt()) {
                escolha = ler.nextInt();
                switch (escolha) {
                    case 1:
                        System.out.println("Informe o nome do cliente: ");
                        String nome = ler.next();
                        System.out.println("Informe o Nº da conta: ");
                        int num = ler.nextInt();
                        
                        ContaBancaria conta = new ContaBancaria(nome, 0);
                        contas.add(conta);
                        System.out.println("Conta Nº"+conta.getNum_conta()+" criada.");
                        break;
                    case 2:
                        System.out.println("Informe o nome do cliente: ");
                        String nomeP = ler.next();
                        System.out.println("Informe o dia de rendimento: ");
                        int dia = ler.nextInt();
                        
                        ContaPoupanca contaP = new ContaPoupanca(nomeP, 0, dia);
                        contas.add(contaP);
                        System.out.println("Conta Nº"+contaP.getNum_conta()+" criada.");
                        break;
                    case 3:
                        System.out.println("Informe o nome do cliente: ");
                        String nomeE = ler.next();
                        System.out.println("Informe o limite da conta: ");
                        int limite = ler.nextInt();
                        
                        ContaEspecial contaE = new ContaEspecial(nomeE, 0, limite);
                        contas.add(contaE);
                        System.out.println("Conta Nº"+contaE.getNum_conta()+" criada.");
                        break;
                    case 4:
                        System.out.println("Informe o numero da conta do cliente: ");
                        int escolhaDeposito = 0;
                        if (ler.hasNextInt()) {
                            escolhaDeposito = ler.nextInt();
                            for (ContaBancaria c : contas) {
                                if (c.getNum_conta() == escolhaDeposito) {
                                    System.out.println("Informe o valor a ser depositado: ");
                                    float deposito = ler.nextFloat();
                                    c.depositar(deposito);
                                }
                            }
                        } else {
                            System.out.println("A conta não existe.");
                            ler.next();
                        }
                        break;
                    case 5:
                        System.out.println("Informe o numero da conta do cliente: ");
                        int escolhaSaque = 0;
                        if (ler.hasNextInt()) {
                            escolhaSaque = ler.nextInt();
                            for (ContaBancaria c : contas) {
                                if (c.getNum_conta() == escolhaSaque) {
                                    System.out.println("Informe o valor a ser sacado: ");
                                    float saque = ler.nextFloat();
                                    c.sacar(saque);
                                }
                            }
                        } else {
                            System.out.println("A conta não existe.");
                            ler.next();
                        }
                        break;
                    case 6:
                        break;
                    case 7:
                        break;
                    case 0:
                        System.out.println("Saindo");
                        break;
                    default:
                        System.out.println("Opção inválida. Favor informar outra opção.");
                        break;
                }
            } else {
                System.out.println("Opção inválida. Favor informar outra opção.");
                ler.next();
            }
            
        } while (escolha != 0);
    }
}
