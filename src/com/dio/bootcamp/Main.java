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

        System.out.println("-----------------------------------------------------------------------");
        System.out.println("Exercício Calculadora:");
        System.out.println("-----------------------------------------------------------------------");

        Calculadora.soma(3, 6);
        Calculadora.subtracao(9, 1.8);
        Calculadora.multiplicacao(7, 8);
        Calculadora.divisão(5, 2.5);

        //Suadação
        System.out.println("");
        System.out.println("-----------------------------------------------------------------------");
        System.out.println("Exercício de Saudação:");
        System.out.println("-----------------------------------------------------------------------");

        Saudacao.obterSaudacao(9);
        Saudacao.obterSaudacao(15);
        Saudacao.obterSaudacao(22);
        Saudacao.obterSaudacao(45);

        //Empréstimo
        System.out.println("");
        System.out.println("-----------------------------------------------------------------------");
        System.out.println("Exercício Empréstimo:");
        System.out.println("-----------------------------------------------------------------------");

        Emprestimo.calcularEmprestimo(1000, Emprestimo.getDuasParcelas());
        Emprestimo.calcularEmprestimo(1000, Emprestimo.getTresParcelas());
        Emprestimo.calcularEmprestimo(1000, 5);

        System.out.println("");

        //Exercício da Aula 02
        System.out.println("***********************************************************************");
        System.out.println("================== Resolução do exercício da Aula 02 ==================");
        System.out.println("***********************************************************************");

        //Área dos quadriláteros notáveis utilizando sobrecarga de método
        System.out.println("");
        System.out.println("-----------------------------------------------------------------------");
        System.out.println("Exercício Cálculo das áreas através de sobrecarga de método:");
        System.out.println("-----------------------------------------------------------------------");

        Quadrilatero.area(3);
        Quadrilatero.area(6d, 7d);
        Quadrilatero.area(5, 7, 3);
        Quadrilatero.area(6f, 8f);

        System.out.println("");

        //Exercício da Aula 03
        System.out.println("***********************************************************************");
        System.out.println("================== Resolução do exercício da Aula 03 ==================");
        System.out.println("***********************************************************************");

        //Área dos quadrilatéros notáveis utilizando a instrução de interrupção "return".
        System.out.println("");
        System.out.println("-----------------------------------------------------------------------");
        System.out.println("Exercício Cálculo das áreas através do return:");
        System.out.println("-----------------------------------------------------------------------");

        double areaQuadrado = QuadrilaterosAula3.area(5);
        System.out.println("Área do quadrado: " + areaQuadrado);

        double areaRetangulo = QuadrilaterosAula3.area(4d, 5d);
        System.out.println("Área do retângulo: " + areaRetangulo);

        double areaTrapezio = QuadrilaterosAula3.area(5, 8, 3);
        System.out.println("Área do retângulo: " + areaTrapezio);

        float areaLosango = QuadrilaterosAula3.area(2f, 3f);
        System.out.println("Área do retângulo: " + areaLosango);

        System.out.println("");
        System.out.println("***********************************************************************");

    }

}
