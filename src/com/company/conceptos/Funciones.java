package com.company.conceptos;

public class Funciones {
    public static void main(String[] args) {
        holaMundo();
        holaMundo();

        saludar("Ricardo");

        String hola = devuelve();
        System.out.println(hola);
    }

    private static void holaMundo() {
        System.out.println("Hola mundo");
        System.out.println("Hola mundo");
    }

    private static void saludar(String name) {
        System.out.println("Hola " + name);
    }

    private static String devuelve() {
        return "Hola";
    }
}
