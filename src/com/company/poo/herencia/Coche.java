package com.company.poo.herencia;

import com.company.poo.clases.Motor;
import com.company.poo.clases.Vehiculo;

public class Coche extends Vehiculo {
    int numPuertas;

    public Coche(String marca, String modelo, int velocidadMaxima, int year, String color, boolean sport, int numPuertas) {
        super(marca, modelo, velocidadMaxima, year, color, sport);
        this.numPuertas = numPuertas;
    }

    @Override
    public String toString() {
        return "Coche{" +
                "numPuertas=" + numPuertas +
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
