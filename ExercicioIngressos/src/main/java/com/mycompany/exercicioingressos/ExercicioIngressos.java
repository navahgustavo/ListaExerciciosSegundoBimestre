package com.mycompany.exercicioingressos;

import java.util.Scanner;

/**
 * @author Gustavo H. Nava
 */
public class ExercicioIngressos {

    public static void main(String[] args) {
        
        Scanner ler = new Scanner(System.in);
        
        Ingresso normal = new Ingresso();
        IngressoVIP vip = new IngressoVIP();
        
        int escolha = -1;
        
        do {            
            System.out.println("----------------------------------");
            System.out.println("Ingressos ||| Normal "+normal.toString()+" | VIP "+vip.toString());
            System.out.println("----------------------------------");
            System.out.println(" 1 - Alterar valor do ingresso");
            System.out.println(" 2 - Alterar valor adicional vip");
            System.out.println(" 0 - Sair");
            System.out.println("----------------------------------");
            if (ler.hasNextInt()) {
                escolha = ler.nextInt();
                switch (escolha) {
                    case 1:
                        System.out.println("Informe o valor do ingresso: ");
                        float valorIngresso = ler.nextFloat();
                        normal.setValor(valorIngresso);
                        vip.setValor(valorIngresso);
                        break;
                    case 2:
                        System.out.println("Informe o valor do adicional: ");
                        float valorAdicional = ler.nextFloat();
                        vip.setValorAdiconal(valorAdicional);
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
}
