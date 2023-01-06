package com.company.conceptos;

public class Excepciones {
    public static void main(String[] args) {
        try {
            int a = 5 / 0;
        } catch (ArithmeticException e) {
            e.printStackTrace();
        } finally {
            System.out.println("Cierre de recursos");
        }

        System.out.println("fin");
    }
}
