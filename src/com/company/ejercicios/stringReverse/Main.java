package com.company.ejercicios.stringReverse;

public class Main {
    public static void main(String[] args) {

        System.out.println(stringInvertido("hello"));
    }

    public static String stringInvertido(String str) {
        String resultado = "";

        for (int i = str.length() - 1; i >= 0; i--) {
            resultado += str.charAt(i);
        }

        return resultado;
    }
}
