package com.company.poo.herencia;

import com.company.poo.clases.Motor;
import com.company.poo.clases.Vehiculo;

public class Camion extends Vehiculo {
    double capacidadCarga;

    public Camion(String marca, String modelo, int velocidadMaxima, int year, String color, boolean sport, double capacidadCarga) {
        super(marca, modelo, velocidadMaxima, year, color, sport);
        this.capacidadCarga = capacidadCarga;
    }

    @Override
    public String toString() {
        return "Camion{" +
                "capacidadCarga=" + capacidadCarga +
                ", marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", velocidadMaxima=" + velocidadMaxima +
                ", velocidadActual=" + velocidadActual +
                ", year=" + year +
                ", color='" + color + '\'' +
                ", sport=" + sport +
                ", motor=" + motor +
                '}';
    }
}
