package com.company.conceptos;

public class StringMethods {
    public static void main(String[] args) {
        String nombre = "Ricardo";
        String nombreMAYU = nombre.toUpperCase();
        System.out.println(nombreMAYU);
        String algo = "ALGO      ";
        String algoSinEspacios = algo.trim();
        System.out.println(algoSinEspacios);

        if (algo.equalsIgnoreCase(algoSinEspacios)) {
            System.out.println(true);
        }
    }
}
