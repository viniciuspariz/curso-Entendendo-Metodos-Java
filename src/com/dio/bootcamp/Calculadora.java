package com.dio.bootcamp;

public class Calculadora {

    /*
     *  Classe de exemplo para a Aula 01 do curso de Métodos do bootcamp.
     */

    public static void soma(double numero1, double numero2) {

        double resultado = numero1 + numero2;

        System.out.println("O resultado da soma do número " + numero1 + " com o número " + numero2 + " é: " + resultado);

    }

    public static void subtracao(double numero1, double numero2) {

        double resultado = numero1 - numero2;

        System.out.println("O resultado da subtração do número " + numero1 + " com o número " + numero2 + " é: " + resultado);

    }

    public static void multiplicacao(double numero1, double numero2) {

        double resultado = numero1 * numero2;

        System.out.println("O resultado da multiplicação do número " + numero1 + " com o número " + numero2 + " é: " + resultado);

    }

    public static void divisão(double numero1, double numero2) {

        double resultado = numero1 / numero2;

        System.out.println("O resultado da divisão do número " + numero1 + " pelo número " + numero2 + " é: " + resultado);

    }

}
