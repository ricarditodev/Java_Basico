package com.company.funciones;

/**
 * consiste en duplicar una funcion con distintos parametros, siendo de diferente numeros y tipos
 */
public class Sobrecarga {
    public static void main(String[] args) {
        System.out.println(a());
    }

    static int a() {
        return 2;
    }

    static int a(int i) {
        return i;
    }

    static double a(double i) {
        return i;
    }

    static double a(double i, double j) {
        return i + j;
    }

    static int a(int i, int j) {
        return i + j;
    }
}
