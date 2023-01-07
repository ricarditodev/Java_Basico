package com.company.funciones;

public class Tarea {
    public static void main(String[] args) {
        var price = 220.25;
        var iva = 0.16;
        var priceTotal = getIVA(price, iva);
        System.out.println(priceTotal);
    }

    static double getIVA(double price, double iva) {
        return price * 0.16d + price;
    }
}
