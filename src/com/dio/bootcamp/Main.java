package com.dio.bootcamp;

public class Main {

    /*
     *  Classe principal dos métodos dos exercícios do curso Entendendo Métodos Java do bootcamp da DIO.
     */

    public static void main(String[] args) {

        //Exercícios da Aula 1

        System.out.println("***********************************************************************");
        System.out.println("================= Resolução dos exercícios da Aula 01 =================");
        System.out.println("***********************************************************************");
        System.out.println("");

        //Calculadora

        System.out.println("Exercício Calculadora:");

        Calculadora.soma(3, 6);
        Calculadora.subtracao(9, 1.8);
        Calculadora.multiplicacao(7, 8);
        Calculadora.divisão(5, 2.5);

        System.out.println("");
        System.out.println("-----------------------------------------------------------------------");
        System.out.println("");

        //Suadação

        System.out.println("Exercício de Saudação:");

        Saudacao.obterSaudacao(9);
        Saudacao.obterSaudacao(15);
        Saudacao.obterSaudacao(22);
        Saudacao.obterSaudacao(45);

        System.out.println("");
        System.out.println("-----------------------------------------------------------------------");
        System.out.println("");

        //Empréstimo

        System.out.println("Exercício Empréstimo:");

        Emprestimo.calcularEmprestimo(1000, Emprestimo.getDuasParcelas());
        Emprestimo.calcularEmprestimo(1000, Emprestimo.getTresParcelas());
        Emprestimo.calcularEmprestimo(1000, 5);

        System.out.println("");

        //Exercício da Aula 02
        System.out.println("***********************************************************************");
        System.out.println("================== Resolução do exercício da Aula 02 ==================");
        System.out.println("***********************************************************************");
        System.out.println("");

        //Área dos quadriláteros notáveis utilizando sobrecarga de método

        Quadrilatero.area(3);
        Quadrilatero.area(6d, 7d);
        Quadrilatero.area(5, 7, 3);
        Quadrilatero.area(6f, 8f);

        System.out.println("");
        System.out.println("-----------------------------------------------------------------------");
        System.out.println("");
    }

}
