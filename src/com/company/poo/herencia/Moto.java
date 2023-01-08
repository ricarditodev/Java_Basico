package com.company.poo.herencia;

import com.company.poo.clases.Vehiculo;

public class Moto extends Vehiculo {
    boolean baul;

    public Moto(String marca, String modelo, int velocidadMaxima, int year, String color, boolean sport, boolean baul) {
        super(marca, modelo, velocidadMaxima, year, color, sport);
        this.baul = baul;
    }

    @Override
    public String toString() {
        return "Moto{" +
                "baul=" + baul +
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
