package com.company.poo.interfaces.conInterfaz;

import com.company.poo.interfaces.sinInterfaz.Empleado;

import java.util.List;

public class EmpleadoCRUDExcel implements EmpleadoCRUD {
    /**
     * guardo los empleados en excel
     * @param empleado
     */
    @Override
    public void guardar(Empleado empleado) {

    }

    /**
     * obtener los empleados de excel
     * @return
     */
    @Override
    public List<Empleado> findAll() {
        return null;
    }

    /**
     * borrar los empleados de excel
     * @param empleado
     */
    @Override
    public void delete(Empleado empleado) {

    }
}
