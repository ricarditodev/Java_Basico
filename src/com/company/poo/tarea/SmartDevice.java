package com.company.poo.tarea;

public abstract class SmartDevice {
    protected String fabricante;
    protected String modelo;
    protected boolean bluetooth;
    protected boolean NFC;
    protected boolean wifi;
    protected String cobertura;

    public SmartDevice() {}

    public SmartDevice(String fabricante, String modelo, boolean bluetooth, boolean NFC, boolean wifi, String cobertura) {
        this.fabricante = fabricante;
        this.modelo = modelo;
        this.bluetooth = bluetooth;
        this.NFC = NFC;
        this.wifi = wifi;
        this.cobertura = cobertura;
    }

    @Override
    public String toString() {
        return "SmartDevice{" +
                "fabricante='" + fabricante + '\'' +
                ", modelo='" + modelo + '\'' +
                ", bluetooth=" + bluetooth +
                ", NFC=" + NFC +
                ", wifi=" + wifi +
                ", cobertura='" + cobertura + '\'' +
                '}';
    }
}
