package com.company.conceptos;

public class ClaseCoche {
    //propiedades
    String color;
    String fabricante;
    String modelo;
    Integer velocidad = 0;

    //contructores
    public ClaseCoche(String color, String fabricante, String modelo) {
        this.color = color;
        this.fabricante = fabricante;
        this.modelo = modelo;
    }

    //metodos
    public void acelerar(Integer cantidad) {
        if (cantidad > 0 && cantidad <= 120) {
            this.velocidad += cantidad;
        }
    }

    @Override
    public String toString() {
        return "ClaseCoche{" +
                "color='" + color + '\'' +
                ", fabricante='" + fabricante + '\'' +
                ", modelo='" + modelo + '\'' +
                ", velocidad=" + velocidad +
                '}';
    }
}
