package com.company.poo.tarea;

public class SmartPhone extends SmartDevice{
    int bateria;
    String sistemaOperativo;
    int OSversion;
    int camara;

    public SmartPhone() {
        super();
    }

    public SmartPhone(String fabricante, String modelo, boolean bluetooth, boolean NFC, boolean wifi, String cobertura, int bateria, String sistemaOperativo, int OSversion, int camara) {
        super(fabricante, modelo, bluetooth, NFC, wifi, cobertura);
        this.bateria = bateria;
        this.sistemaOperativo = sistemaOperativo;
        this.OSversion = OSversion;
        this.camara = camara;
    }

    @Override
    public String toString() {
        return "SmartPhone{" +
                "bateria=" + bateria +
                ", sistemaOperativo='" + sistemaOperativo + '\'' +
                ", OSversion=" + OSversion +
                ", camara=" + camara +
                ", fabricante='" + fabricante + '\'' +
                ", modelo='" + modelo + '\'' +
                ", bluetooth=" + bluetooth +
                ", NFC=" + NFC +
                ", wifi=" + wifi +
                ", cobertura='" + cobertura + '\'' +
                '}';
    }
}
