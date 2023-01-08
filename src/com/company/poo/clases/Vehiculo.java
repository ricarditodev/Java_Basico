package com.company.poo.clases;

public abstract class Vehiculo {
    //1. propiedades
    protected String marca;
    protected String modelo;
    protected int velocidadMaxima;
    protected double velocidadActual;
    protected int year;
    protected String color;
    protected boolean sport;
    protected Motor motor;

    //2. constructores --> se encarga de inicializar los objetos - con las propiedades especificadas en su clase
    public Vehiculo() {

    }

    public Vehiculo(String marca, String modelo, Motor motor) {
        this.marca = marca;
        this.modelo = modelo;
        this.motor = motor;
    }

    public Vehiculo(String marca, String modelo, int velocidadMaxima, int year, String color, boolean sport) {
        this.marca = marca;
        this.modelo = modelo;
        this.velocidadMaxima = velocidadMaxima;
        this.year = year;
        this.color = color;
        this.sport = sport;
    }

    //3. metodos(comportamiento)
    public void acelerar(double cantidad) {
        this.velocidadActual += cantidad;
    }

    @Override
    public String toString() {
        return "Vehiculo{" +
                "marca='" + marca + '\'' +
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
