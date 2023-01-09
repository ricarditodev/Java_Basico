package com.company.ejercicios.deAñoASiglo;

public class Main {
    public static void main(String[] args) {

        System.out.println(century(1705));
    }

    public static int century(int year) {
        double siglo = year / 100d;
        int resultado = (int) Math.ceil(siglo);

        return resultado;
    }
}
