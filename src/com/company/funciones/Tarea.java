package com.company.funciones;

import java.util.Scanner;

public class Tarea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce el IVA");
        int IVA = scanner.nextInt();
        double ivaCompuesto = getIVA(IVA);

        System.out.println("Introduce un precio");
        var price = scanner.nextDouble();
        var totalPrice = getPrice(price, ivaCompuesto);
        System.out.println("El precio total de tu compra es " + totalPrice);
    }

    static double getIVA(int iva) {
        return iva / 100d;
    }

    static double getPrice(double price, double iva) {
        return price * iva + price;
    }
}
