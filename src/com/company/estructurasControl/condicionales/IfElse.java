package com.company.estructurasControl.condicionales;

import java.util.Scanner;

public class IfElse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Cual es tu edad?");
        int edad = scanner.nextInt();

        boolean esMayor = edad >= 18;

        if (esMayor) {
            System.out.println("Eres mayor de edad");
        } else {
            System.out.println("Eres menor de edad");
        }
    }
}
