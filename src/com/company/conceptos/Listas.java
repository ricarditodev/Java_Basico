package com.company.conceptos;

import java.util.ArrayList;
import java.util.List;

public class Listas {
    public static void main(String[] args) {
        List<String> nombres = new ArrayList<>();

        nombres.add("Ricardo");
        nombres.add("David");
        System.out.println(nombres);

        for (String nombre: nombres) {
            System.out.println(nombre);
        }
    }
}
