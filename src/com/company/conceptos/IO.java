package com.company.conceptos;

import java.util.Scanner;

public class IO {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String nombre = scanner.nextLine();
        int numero = scanner.nextInt();
        System.out.println("Tu nombre es " + nombre);
        System.out.println("El numero es " + numero);
    }
}
