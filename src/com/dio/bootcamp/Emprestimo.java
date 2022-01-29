package com.dio.bootcamp;

public class Emprestimo {

    /*
     *  Classe de exemplo para a Aula 01 do curso de Métodos do bootcamp.
     */

    public static int getDuasParcelas() {
        return 2;
    }

    public static int getTresParcelas() {
        return 3;
    }

    public static double getTaxaDuasParcelas() {
        return 0.3;
    }

    public static double getTaxaTresParcelas() {
        return 0.45;
    }

    public static void calcularEmprestimo(double principal, int parcelas) {

        if (parcelas == 2) {
            double valorFinal = principal + (principal * getTaxaDuasParcelas());
            System.out.println("O valor final do empréstimo para " + parcelas + " parcelas é de: R$ " + valorFinal);
        } else if (parcelas == 3) {
            double valorFinal = principal + (principal * getTaxaTresParcelas());
            System.out.println("O valor final do empréstimo para " + parcelas + " parcelas é de: R$ " + valorFinal);
        } else {
            System.out.println("Quantidade de parcelas não aceita.");
        }

    }

}
