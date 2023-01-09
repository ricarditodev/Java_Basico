package com.company.poo.interfaces.conInterfaz;

import com.company.poo.interfaces.sinInterfaz.Empleado;

import java.util.List;

public class EmpleadoCRUDMySQL implements EmpleadoCRUD {
    /**
     * guarda un empleado en la base de datos
     * @param empleado
     */
    @Override
    public void guardar(Empleado empleado) {

    }

    /**
     * recupera todos los empleados de la base de datos
     * @return
     */
    @Override
    public List<Empleado> findAll() {
        return null;
    }

    /**
     * borra un empleado de la base de datos
     * @param empleado
     */
    @Override
    public void delete(Empleado empleado) {

    }
}
