package com.company.poo.clases;

public class Vehiculo {
    //1. propiedades
    String marca;
    String modelo;
    int velocidadMaxima;
    double velocidadActual;
    int year;
    String color;
    boolean sport;
    Motor motor;

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
}
