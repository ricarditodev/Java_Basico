package com.company.poo.interfaces.conInterfaz;

import com.company.poo.interfaces.sinInterfaz.Empleado;

import java.util.List;

public interface EmpleadoCRUD {
    void guardar(Empleado empleado);

    List<Empleado> findAll();

    void delete(Empleado empleado);
}