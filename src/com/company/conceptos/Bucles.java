package com.company.conceptos;

public class Bucles {
    public static void main(String[] args) {
        int a = 10;
        for (int i = 1; i <= a ; i++) {
            System.out.println(i);
        }

        //-----------------------------------------
        boolean check = true;
        while (check) {
            System.out.println("Estudiando los bucles");
            break; //rompe el flujo de ejecucion
        }

        //-----------------------------------------
        int count = 0;
        do {
            count++;
            if (count == 6) {
                continue; //salta el valor 6 y sigue con la siguiente iteracion
            }
            System.out.println(count);
        } while (count < 10);
    }
}
