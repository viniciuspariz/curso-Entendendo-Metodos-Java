package com.dio.bootcamp;

public class Quadrilatero {

    /*
     *  Classe de exemplo para a Aula 02 do curso de Métodos do bootcamp.
     */
    public static void area(double lado) {
        System.out.println("Área do quadrado é: " + lado * lado);
    }

    public static void area(double lado1, double lado2) {
        System.out.println("Área do retângulo é: " + lado1 * lado2);
    }

    public static void area(double baseMaior, double baseMenor, double altura) {
        System.out.println("Área do trapézio é: " + ((baseMaior + baseMenor) * altura) / 2);
    }
}
