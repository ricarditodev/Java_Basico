package com.company.conceptos;

import java.util.HashMap;
import java.util.Map;

public class Mapas {
    public static void main(String[] args) {
        Map<String, String> personas = new HashMap<>();

        personas.put("Nombre", "Ricardo");
        personas.put("Segundo-Nombre", "David");
        personas.put("Apellido", "Aguilar");

        System.out.println(personas);

        for (String key : personas.keySet()) {
            System.out.println(key);
        }

        for (String values : personas.values()) {
            System.out.println(values);
        }

        for (Map.Entry<String, String> pair : personas.entrySet()) {
            System.out.println(pair.getKey() + " / " + pair.getValue());
        }
    }
}
