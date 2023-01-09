package com.company.poo.interfaces.sinInterfaz;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        EmpleadoCRUD empleadoCRUD = new EmpleadoCRUD();

        Empleado ricardo = new Empleado("Ricardo", 21, 5000d, true);
        Empleado david = new Empleado("David", 30, 1000, true);

        empleadoCRUD.guardar(ricardo);
        empleadoCRUD.guardar(david);

        List<Empleado> empleados = empleadoCRUD.findAll();
        System.out.println(empleados);
    }
}
