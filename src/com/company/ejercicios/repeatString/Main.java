package com.company.ejercicios.repeatString;

public class Main {
    public static void main(String[] args) {

        System.out.println(repeatStr(5, "c"));
    }

    public static String repeatStr(final int repeat, final String string) {
        //igualamos una variable al parametro pasado a la funcion
        String resultado = string;

        //si las repeticiones son menores o iguales a 0, retornamos un string vacio
        if (repeat <= 0) {
            resultado = "";
        }

        //iteramos desde el 1 hasta el valor pasado por parametro, para luego guardar el parametro recibo la cantidad de n veces en la variable que vamos a retornar
        for (int i = 1; i < repeat; i++) {
            resultado += string;
        }

        return resultado;
    }
}

