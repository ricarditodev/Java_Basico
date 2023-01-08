package com.company.poo.clases;

public class Main {
    public static void main(String[] args) {
        Vehiculo camaro = new Vehiculo();
        Motor motorElectrico = new Motor(250, "electrico");
        Vehiculo camaro1 = new Vehiculo("Chevy", "Camaro", motorElectrico);

        System.out.println(camaro1.modelo);
    }
}
