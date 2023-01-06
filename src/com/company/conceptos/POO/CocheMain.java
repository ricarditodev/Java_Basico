package com.company.conceptos.POO;

import com.company.conceptos.POO.ClaseCoche;

public class CocheMain {
    public static void main(String[] args) {
        ClaseCoche coche = new ClaseCoche("azul", "BMW", "Z301");

        coche.acelerar(20);
        System.out.println(coche);

        CocheElectrico cocheElectrico = new CocheElectrico("Negro", "Toyota", "RAV4", "ABC");

        System.out.println(cocheElectrico);

        CocheElectrico cocheElectrico1 = new CocheElectrico("ZXC");

        System.out.println(cocheElectrico1);

        cocheElectrico.acelerar(50);
        System.out.println(cocheElectrico);

    }
}
