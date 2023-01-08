package com.company.poo.tarea;

public class SmartWatch extends SmartDevice{
    int bateria;
    String sistemaOperativo;
    int version;
    boolean llamadas;

    public SmartWatch() {
        super();
    }

    public SmartWatch(String fabricante, String modelo, boolean bluetooth, boolean NFC, boolean wifi, String cobertura, int bateria, String sistemaOperativo, int version, boolean llamadas) {
        super(fabricante, modelo, bluetooth, NFC, wifi, cobertura);
        this.bateria = bateria;
        this.sistemaOperativo = sistemaOperativo;
        this.version = version;
        this.llamadas = llamadas;
    }

    @Override
    public String toString() {
        return "SmartWatch{" +
                "bateria=" + bateria +
                ", sistemaOperativo='" + sistemaOperativo + '\'' +
                ", version=" + version +
                ", llamadas=" + llamadas +
                ", fabricante='" + fabricante + '\'' +
                ", modelo='" + modelo + '\'' +
                ", bluetooth=" + bluetooth +
                ", NFC=" + NFC +
                ", wifi=" + wifi +
                ", cobertura='" + cobertura + '\'' +
                '}';
    }
}
