package com.company.ejercicios.stringToNumber;

public class Main {
    public static void main(String[] args) {

        int numeros = stringToNumber("1234");
        System.out.println(numeros);
    }

    public static int stringToNumber(String str) {
        int resultado = Integer.parseInt(str);

        return resultado;
    }
}
