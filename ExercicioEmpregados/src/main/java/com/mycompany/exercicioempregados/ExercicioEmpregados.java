package com.mycompany.exercicioempregados;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author Gustavo H. Nava
 */
public class ExercicioEmpregados {

    static List<Empregado> empregados = new ArrayList<>();
    
    public static void main(String[] args) {
    
        Scanner ler = new Scanner(System.in);
        
        int escolha = -1;
        
        do {            
            System.out.println("----------------------------------");
            System.out.println(" Funcionarios ");
            System.out.println("----------------------------------");
            System.out.println(" 1 - Cadastrar Empregado");
            System.out.println(" 2 - Cadastrar Gerente");
            System.out.println(" 3 - Cadastrar Vendedor");
            System.out.println(" 4 - Listar");
            System.out.println(" 0 - Sair");
            System.out.println("----------------------------------");
            if (ler.hasNextInt()) {
                escolha = ler.nextInt();
                switch (escolha) {
                    case 1:
                        System.out.println("Informe o nome: ");
                        String nomeE = ler.next();
                        
                        System.out.println("Informe o salario: ");
                        float salarioE = ler.nextFloat();
                        
                        Empregado emp = new Empregado(nomeE,salarioE);
                        empregados.add(emp);
                        break;
                    case 2:
                        System.out.println("Informe o nome: ");
                        String nomeG = ler.next();
                        
                        System.out.println("Informe o salario: ");
                        float salarioG = ler.nextFloat();
                        
                        System.out.println("Informe o departamento:");
                        String departamentoG = ler.next();
                        
                        Gerente ger = new Gerente(nomeG, salarioG, departamentoG);
                        empregados.add(ger);
                        break;
                    case 3:
                        System.out.println("Informe o nome: ");
                        String nomeV = ler.next();
                        
                        System.out.println("Informe o salario: ");
                        float salarioV = ler.nextFloat();
                        
                        System.out.println("Informe o percentual de comissao:");
                        float percentualV = ler.nextFloat();
                        
                        Vendedor ven = new Vendedor(nomeV, salarioV, percentualV);
                        empregados.add(ven);
                        break;
                    case 4:
                        for (Empregado e : empregados) {
                            System.out.println("----------------------------------");
                            System.out.println(e.toString());
                        }
                        break;
                    case 0:
                        System.out.println("Encerrando...");
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
    /*
    public static void imprimirCadastros() {
        for (Empregado e : empregados) {
            
        }
    }*/
}
