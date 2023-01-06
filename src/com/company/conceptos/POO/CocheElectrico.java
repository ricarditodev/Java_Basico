package com.company.conceptos.POO;

public class CocheElectrico extends ClaseCoche {
    String motorElectrico;

    public CocheElectrico(String color, String fabricante, String modelo, String motorElectrico) {
        super(color, fabricante, modelo);
        this. motorElectrico = motorElectrico;
    }

    public CocheElectrico() {}

    public CocheElectrico(String motorElectrico) {
        super();
        this.motorElectrico = motorElectrico;
    }

    @Override
    public void acelerar(Integer cantidad) {
        Integer velocidadX2 = cantidad * 2;
        super.acelerar(velocidadX2);
    }

    @Override
    public String toString() {
        return "CocheElectrico{" +
                "motorElectrico='" + motorElectrico + '\'' +
                ", color='" + color + '\'' +
                ", fabricante='" + fabricante + '\'' +
                ", modelo='" + modelo + '\'' +
                ", velocidad=" + velocidad +
                '}';
    }
}
