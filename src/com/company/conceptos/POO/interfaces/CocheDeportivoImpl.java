package com.company.conceptos.POO.interfaces;

import com.company.conceptos.POO.ClaseCoche;
import com.company.conceptos.POO.CocheElectrico;
import com.company.conceptos.POO.interfaces.CocheService;

public class CocheDeportivoImpl implements CocheService {

    @Override
    public ClaseCoche crearCocheDemo() {
        return new CocheElectrico();
    }
}
