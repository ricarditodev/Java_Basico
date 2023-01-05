package com.company.conceptos;

public class IfElse {
    public static void main(String[] args) {
        boolean check = 5 > 10;

        if (check) {
            System.out.println("Cierto");
        } else if (!check){
            System.out.println("Falso");
        } else {
            System.out.printf("Algo");
        }
    }
}
