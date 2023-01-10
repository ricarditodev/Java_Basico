package com.company.tiposDeDatosAvanzados;

import java.util.Vector;

public class Vectores {
    public static void main(String[] args) {
        //este tipo de dato recibe dos parametros opcionales,
        // capacidad inicial que por defecto es 10,
        // y el incremento de esa capacidad cuando se alcanza su maximo, que por defecto es el doble de la capacidad
        Vector<Integer> vector = new Vector<>(10, 15);

        vector.add(1);
        vector.add(2);
        vector.add(3);
        vector.add(4);
        System.out.println(vector);

        vector.remove(2);
        System.out.println(vector);

        //otros metodos son: vector.size() para conocer el tamaño actual del vector, y vector.capacity() para saber la capacidad del vector(10 por defecto)

        //-----------------------
        //comparar vectores
        Vector<Integer> vector2 = new Vector<>(10);
        vector2.add(1);
        vector2.add(2);

        boolean resultado = vector.equals(vector2);
        System.out.println(resultado);

        //-----------------------
        //iterar sobre un vector
        for (Integer i : vector2) {
            System.out.println("El valor de i: " + i);
        }

        Vector<Integer> vector3 = new Vector<>();
        vector3.add(1);
        vector3.add(2);
        vector3.add(3);

        //no podre acceder a la posicion de un vector luego de ser eliminada, puedo detener el flujo de ejecucion o simplemente salta una iteracion
        for (int i = 0; i < vector3.size() ; i++) {
            if (i % 2 == 0) {
                vector3.remove(i);
                continue;
            }
            System.out.println("El valor de cada iteracion es: " + vector3.get(i));
        }

        //-----------------------
        //decrementar la capacidad de un vector
        Vector<String> nombres = new Vector<>(16);
        nombres.add("Ricardo");
        nombres.add("David");

        nombres.trimToSize();
        System.out.println(nombres.capacity());
    }
}
