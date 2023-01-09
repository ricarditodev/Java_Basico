package com.company.poo.interfaces.conInterfaz;

import com.company.poo.interfaces.sinInterfaz.Empleado;

public class Main {
    static EmpleadoCRUD empleadoCRUD;

    public static void main(String[] args) {
        empleadoCRUD.findAll();
        empleadoCRUD.guardar(new Empleado());
    }
}
