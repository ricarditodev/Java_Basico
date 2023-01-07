package com.company.estructurasControl.condicionales;

import java.util.Scanner;

public class ElseIf {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce tu dia de la semana");
        String dia = scanner.nextLine().toLowerCase();

        if (dia.equalsIgnoreCase("lunes")) {
            System.out.println("Es " + dia);
        } else if (dia.equalsIgnoreCase("martes")) {
            System.out.println("Es " + dia);
        } else if (dia.equalsIgnoreCase("miércoles")) {
            System.out.println("Es " + dia);
        } else if (dia.equalsIgnoreCase("jueves")) {
            System.out.println("Es " + dia);
        } else if (dia.equalsIgnoreCase("viernes")) {
            System.out.println("Es " + dia);
        } else if (dia.equalsIgnoreCase("sabado")) {
            System.out.println("Es " + dia);
        } else if(dia.equalsIgnoreCase("domingo")) {
            System.out.println("Es " + dia);
        } else {
            System.out.println("No es un dia de la semana");
        }
    }
}