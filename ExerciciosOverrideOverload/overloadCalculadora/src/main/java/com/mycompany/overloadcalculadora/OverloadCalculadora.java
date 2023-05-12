package com.mycompany.overloadcalculadora;

/**
 * @author Gustavo H. Nava
 */
public class OverloadCalculadora {

    public static void main(String[] args) {
        Calculadora calc = new Calculadora();
        
        int somaInt = calc.somar(2, 3);
        double somaDouble = calc.somar(2.5, 3.5);
        
        int[] inteiros = {5,6,5,8,9,7};
        int somaArray = calc.somar(inteiros);
        
        System.out.println(somaInt + "\n" + somaDouble + "\n" + somaArray);
    }
}
