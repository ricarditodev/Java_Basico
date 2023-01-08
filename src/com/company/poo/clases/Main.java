package com.company.poo.clases;

import com.company.poo.herencia.Camion;
import com.company.poo.herencia.Coche;
import com.company.poo.herencia.Moto;

public class Main {
    public static void main(String[] args) {


        Vehiculo[] misVehiculos = new Vehiculo[3];

        misVehiculos[0] = new Coche("Ford", "Focus", 250, 2021, "Rojo", true, 4);
        misVehiculos[1] = new Moto("Yamaha", "A5", 120, 2020, "Negra", true, true);
        misVehiculos[2] = new Camion("Mercedes", "T25", 280, 2015, "Blanco", false, 1000);

        for (Vehiculo vehiculos : misVehiculos) {
            System.out.println(vehiculos.toString());
        }
    }
}
