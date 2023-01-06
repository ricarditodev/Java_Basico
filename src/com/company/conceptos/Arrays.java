package com.company.conceptos;

public class Arrays {
    public static void main(String[] args) {
        int uno = 1;
        int dos = 2;
        int tres = 3;

        int[] numeros = new int[]{uno, dos, tres};

        for (int i = 0; i < numeros.length; i++) {
            System.out.println(numeros[i] * 2);
        }
    }
}
