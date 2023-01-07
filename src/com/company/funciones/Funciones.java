package com.company.funciones;

public class Funciones {
    public static void main(String[] args) {
        System.out.println("A");
        System.out.println("B");
        System.out.println("C");

        //posibilidad 1: funcion sin parametros y sin tipo de retorno
        showABC();
        showABC();

        //posibilidad 2: funcion sin parametros y con tipo de retorno
        double price = getPrice();
        System.out.println(price);

//      String getABC = getABC();
//      System.out.println(getABC);
//      System.out.println(getABC());

        //posibilidad 3: funcion con parametros y sin tipo de retorno
        showSaludo("Ricardo");

        //posibilidad 4: funcion con parametros y con tipo de retorno
         int suma = suma(9);
         System.out.println(suma);
         System.out.println(suma(15));
    }

    /**
     * funcion con tipo de retorno y con parametros
     * @param number
     * @return
     */
    static int suma(int number){
        return number + 1;
    }

    /**
     * funcion sin retorno y que recibe parametros
     * @param name
     */
    static void showSaludo(String name) {
        System.out.println("Hola " + name);
    }

    /**
     * funcion que tiene un tipo de retorno double
     * @return
     */
    static double getPrice() {
        return 99.99d;
    }

    /**
     * funcion que no retorna nada(void)
     */
    static void showABC() {
        System.out.println("A desde la funcion");
        System.out.println("B desde la funcion");
        System.out.println("C desde la funcion");
    }

    /**
     * funcion con un tipo de retorno String
     * @return
     */
    static String getABC() {
        return "A \n B \n C";
    }
}
