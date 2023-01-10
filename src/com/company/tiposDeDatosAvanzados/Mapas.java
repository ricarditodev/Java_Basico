package com.company.tiposDeDatosAvanzados;

import java.util.HashMap;
import java.util.Map;

public class Mapas {
    public static void main(String[] args) {
        HashMap<String, Integer> mapa = new HashMap<>();

        mapa.put("A", 1);
        mapa.put("B", 2);
        mapa.put("C", 3);
        mapa.put("C", 4);

        mapa.replace("C", 5);

        mapa.remove("A");

        System.out.println(mapa);

        //tanto la clave como el valor se guardan en la variable temporal del bucle
        //para obtener la clave usamos el metodo getKey() mientras estamos iterando
        //para obtener el valor usamos el metodo getValue() mientras estamos iterando
        for (Map.Entry<String, Integer> elemento : mapa.entrySet()) {
            System.out.println("Key: " + elemento.getKey());
            System.out.println("Value: " + elemento.getValue());
        }
    }
}
