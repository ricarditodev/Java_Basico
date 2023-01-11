package com.company.tiposDeDatosAvanzados;

public class Arrays {
    public static void main(String[] args) {
        //declaramos el tipo de dato que va a contener el array
        //seguido del identificador, e instanciando ese mismo tipo de dato con la cantidad de elementos que va a contener el array
        //utilizamos esta manera de crear un array cuando no conocemos los valores de los elementos
        int[] arrayUno = new int[5];
        //añadir elementos al array
        arrayUno[0] = 1;
        arrayUno[1] = 2;
        arrayUno[2] = 3;
        arrayUno[3] = 4;
        arrayUno[4] = 5;

        //si queremos conocer la longitud de un array haremos uso de la propiedad length
        //para recorrer un array, utilizamos los bucles for - forEach
        for (int i : arrayUno) {
            System.out.println(i);
        }

        System.out.println("-----------------");

        //
        int[] arrayDos = {1, 2, 3, 4, 5};
        for (int i = 0; i < arrayDos.length; i++) {
            System.out.println(arrayDos[i]);
        }

        //----------------------//
        System.out.println("-----------------");

        //van en el siguiente orden: filas, columnas
        //utilizamos esta manera cuando no conocemos los valores de los elementos
        int[][] arrayBi = new int[2][4];

        arrayBi[0][0] = 1;
        arrayBi[0][1] = 2;
        arrayBi[0][2] = 3;
        arrayBi[0][3] = 4;

        arrayBi[1][0] = 10;
        arrayBi[1][1] = 20;
        arrayBi[1][2] = 30;
        arrayBi[1][3] = 40;

        for (int i = 0; i < arrayBi.length ; i++) {
            System.out.println("Valor de i " + i);

            for (int j = 0; j < arrayBi[i].length; j++) {
                System.out.println("Estoy en i: " + i + ", j: " + j);
                System.out.println(arrayBi[i][j]);
            }
        }

        System.out.println("-----------------");

        //utilizamos esta manera de crear un array cuando conocemos sus elementos
        // 2 filas x 4 columnas
        int[][] arrayBi2 = {
                { 1, 2, 3, 4 },
                { 10, 20, 30, 40 }
        };

        for (int i = 0; i < arrayBi2.length ; i++) {
            System.out.println("Valor de i: " + i);

            for (int j = 0; j < arrayBi2[i].length ; j++) {
                System.out.println("Estoy en i: " + i + ", j: " + j);
                System.out.println(arrayBi2[i][j]);
            }
        }
    }
}
