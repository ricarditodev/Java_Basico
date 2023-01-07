package com.company.estructurasControl.condicionales;

import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce el día");
        String dia = scanner.nextLine().toLowerCase();

        switch (dia) {
            case "lunes":
                System.out.println("El día es " + dia);
                break;
            case "martes":
                System.out.println("El día es " + dia);
                break;
            case "miercoles":
                System.out.println("El día es " + dia);
                break;
            case "jueves":
                System.out.println("El día es " + dia);
                break;
            case "viernes":
                System.out.println("El día es " + dia);
                break;
            case "sabado":
                System.out.println("El día es " + dia);
                break;
            case "domingo":
                System.out.println("El día es " + dia);
                break;
            default:
                System.out.println("No es un día válido");
        }
    }
}
