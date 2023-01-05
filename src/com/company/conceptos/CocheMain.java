package com.company.conceptos;

public class CocheMain {
    public static void main(String[] args) {
        ClaseCoche coche = new ClaseCoche("azul", "BMW", "Z301");

        coche.acelerar(20);
        System.out.println(coche);
    }
}
