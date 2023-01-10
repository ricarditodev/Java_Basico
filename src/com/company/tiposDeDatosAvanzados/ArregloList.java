package com.company.tiposDeDatosAvanzados;

import java.util.ArrayList;

public class ArregloList {
    public static void main(String[] args) {
        //capacidadVector = capacidadVector * 2 -> los vectores aumentan su capacidad al doble
        //los arraylist derivan de la misma clase padre que los vectores, por lo tanto tienen los mismos metodos
        //capacidadArrayList = capacidadArrayList + (capacidadArrayList * 0.5) -> los ArrayList aumentan su capacidad al 50%
        ArrayList<String> lista = new ArrayList<>();
        lista.add("A");
        lista.add("B");
        lista.add("C");
        lista.add("D");

        lista.remove(3);

        for (String i : lista) {
            System.out.println(i);
        }

        for (int i = 0; i < lista.size(); i++) {
            System.out.println(lista.get(i));
        }

        //-----------------------
        //convertir un arrayList a un array
        //declaramos un array con el tamaño del arrayList
        String[] array = new String[lista.size()];

        //recorremos el arrayList, en cada iteracion asignamos a cada posicion en el indice del array el elemento del arraylist mediante el metodo get()
        for (int i = 0; i < lista.size(); i++) {
            array[i] = lista.get(i);
        }

        System.out.println("----------------");

        for (String i : array) {
            System.out.println(i);
        }

        /*
        //otra manera de convertir un ArrayList en un array
        * for (Object arrayObjeto : lista.toArray()) {
            System.out.println(arrayObjeto.toString());
          }
        * */
    }
}
