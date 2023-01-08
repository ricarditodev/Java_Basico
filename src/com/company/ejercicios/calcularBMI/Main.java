package com.company.ejercicios.calcularBMI;

public class Main {
    public static void main(String[] args) {

        System.out.println(peso(120.2d, 1.83d));
    }

    static String bajoPeso = "Underweight";
    static String normal = "Normal";
    static String sobrePeso = "Overweight";
    static String obeso = "Obese";

    public static String peso(double peso, double altura) {
        var calculo = peso / Math.pow(altura, 2);
        String resultado = "";

        if (calculo <= 18.5d) {
            resultado = bajoPeso;
        } else if (calculo <= 25.0d) {
            resultado = normal;
        } else if (calculo <= 30.0d) {
            resultado = sobrePeso;
        } else if (calculo >= 30) {
            resultado = obeso;
        }

        return resultado;
    }
}
