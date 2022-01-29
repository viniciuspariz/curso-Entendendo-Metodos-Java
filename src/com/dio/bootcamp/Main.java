package com.dio.bootcamp;

public class Main {

    /*
     *  Classe principal dos métodos do exercício da Aula 01 do bootcamp.
     */

    public static void main(String[] args) {

        //Calculadora
        System.out.println("Exercício Calculadora:");
        Calculadora.soma(3, 6);
        Calculadora.subtracao(9, 1.8);
        Calculadora.multiplicacao(7, 8);
        Calculadora.divisão(5, 2.5);

        //Suadação

        System.out.println("Exercício de Saudação:");
        Saudacao.obterSaudacao(9);
        Saudacao.obterSaudacao(15);
        Saudacao.obterSaudacao(22);
        Saudacao.obterSaudacao(45);

        //Empréstimo
        System.out.println("Exercício Empréstimo:");
        Emprestimo.calcularEmprestimo(1000,Emprestimo.getDuasParcelas());
        Emprestimo.calcularEmprestimo(1000,Emprestimo.getTresParcelas());
        Emprestimo.calcularEmprestimo(1000,5);

    }

}
