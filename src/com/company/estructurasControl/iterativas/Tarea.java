package com.company.estructurasControl.iterativas;

public class Tarea {
    public static void main(String[] args) {
        String[] numeros = {"1", "2", "3", "4", "5", "6"};
        String resultado = "";
        for (String numero : numeros) {
            resultado += numero;
        }
        System.out.println(resultado);
    }
}
