package com.company.estructurasControl.iterativas;

public class ForEach {
    public static void main(String[] args) {
        String[] nombres = {"Ricardo", "Ricardo", "Ricardo", "Ricardo"};
        /**
         * para el bucle forEach, especificamos el tipo de dato de la estructura que vamos a iterar
         * seguido del nombre de la variable que actua como indice de la estructura(i)
         * y por ultimo el nombre de la estructura de dato a la que queremos iterar
         */
        for (String index : nombres) {
            System.out.println(index);
        }

        int[] numeros = {1, 2, 3, 4, 5, 6, 7, 8};
        for (int index : numeros) {
            System.out.println(index);
        }

        int suma = 0;
        for (int index : numeros) {
            suma += index;
//            System.out.println(suma);
        }
//        System.out.println(suma);
    }
}
