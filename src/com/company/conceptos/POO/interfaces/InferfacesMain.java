package com.company.conceptos.POO.interfaces;

import com.company.conceptos.POO.ClaseCoche;

public class InferfacesMain {
    public static void main(String[] args) {
        CocheService service = new CocheDeportivoImpl();

        ClaseCoche coche = service.crearCocheDemo();
        System.out.println(coche);
    }
}
