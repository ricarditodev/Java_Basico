package com.company.conceptos;

public class Switch {
    public static void main(String[] args) {
        String estaciones = "nada";

        //se evalua la condicion de cada case, se ejecuta su codigo si cumple alguna condicion
        switch (estaciones) {
            case "invierno":
                System.out.println("Es " + estaciones);
                break;
            case "verano":
                System.out.println("Es " + estaciones);
                break;
            case "primavera":
                System.out.println("Es " + estaciones);
                break;
            case "otoño":
                System.out.println("Es " + estaciones);
                break;
            default:
                System.out.println("No es una estacion");
                break;
        }
    }
}
