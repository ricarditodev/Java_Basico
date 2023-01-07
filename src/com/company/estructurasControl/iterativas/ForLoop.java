package com.company.estructurasControl.iterativas;

public class ForLoop {
    public static void main(String[] args) {
        int suma = 0;
        int[] numeros = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        for (int i = 0; i < numeros.length ; i++) {
            suma += numeros[i];
            System.out.println(suma);
        }

        String[] nombres = {"1", "2", "3", "4", "5", "6"};
        for (int i = 0; i < nombres.length ; i++) {
            System.out.println(nombres[i]);
        }
    }
}
