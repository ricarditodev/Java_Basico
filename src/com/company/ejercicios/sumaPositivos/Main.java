package com.company.ejercicios.sumaPositivos;

public class Main {
    public static void main(String[] args) {
        int[] numeros = new int[]{};

        System.out.println(suma(numeros));
    }

    public static int suma(int[] numeros) {
        //se crea una variable donde se guarda la suma del array pasado por parametros
        int resultado = 0;

        //se itera sobre cada elemento del array y se guarda en la variable, exceptuando los elementos que son negativos
        for (int i : numeros) {
            if (i <= 0) {
                continue;
            }
            resultado += i;
        }
        return resultado;
    }
}
