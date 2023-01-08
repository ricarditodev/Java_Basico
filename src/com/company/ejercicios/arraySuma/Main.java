package com.company.ejercicios.arraySuma;

public class Main {
    public static void main(String[] args) {
        double[] numeros = new double[]{1, 5.2, 4, 0, -1};

        System.out.println(suma(numeros));
    }

    //la funcion itera sobre cada elemento del array pasado por parametro, y lo suma a una variable exterior
    public static double suma(double[] numeros) {
        double suma = 0;
        for (double i : numeros) {
            suma += i;
        }
        return suma;
    }
}
