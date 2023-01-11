package com.company.tarea;

import java.io.*;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Vector;

public class Main {

    public static class StringReverse {

        public static void main(String[] args) {
            String texto = "Hello World";
            String textoAlReves = "";

            for (int i = texto.length() - 1; i >= 0; i--) {
                textoAlReves += texto.charAt(i);
            }

            System.out.println(textoAlReves);
        }
    }

    public static class ArrayUni {

        public static void main(String[] args) {
            String[] arrayUni = { "A", "B", "C" };

            for (String valores : arrayUni) {
                System.out.println(valores);
            }
        }
    }

    public static class ArrayBidi {

        public static void main(String[] args) {
            int[][] enteros = {
                    { 1, 2 },
                    { 1, 2 }
            };

            for (int i = 0; i < enteros.length; i++) {
                for (int j = 0; j < enteros[i].length; j++) {
                    System.out.println("La posicion actual es: " + j + ", el valor actual es: " + enteros[i][j]);
                }
            }
        }
    }

    public static class Vectores {

        //el problema de los vectores es, al exceder su capacidad crea un nuevo array copiando los elementos del array anterior y duplicando su capacidad
        public static void main(String[] args) {
            Vector<Integer> numeros = new Vector<>();
            numeros.add(0);
            numeros.add(1);
            numeros.add(2);
            numeros.add(3);
            numeros.add(4);

            numeros.remove(1);
            numeros.remove(1);

            System.out.println(numeros);
        }
    }

    public static class ArregloList {

        public static void main(String[] args) {
            ArrayList<String> textos = new ArrayList<>();

            textos.add("A");
            textos.add("B");
            textos.add("C");
            textos.add("D");

            LinkedList<String> lista = new LinkedList<>(textos);

            for (String element : textos) {
                System.out.println(element);
            }

            System.out.println("--------------------------");

            for (String element : lista) {
                System.out.println(element);
            }
        }
    }

    public static class ArregloList2 {

        public static void main(String[] args) {
            ArrayList<Integer> numeros = new ArrayList<>();

            for (int i = 1; i <= 10; i++) {
                numeros.add(i);
            }

            for (int i = 0; i < numeros.size(); i++) {
                if (2 * i == numeros.get(i)) {
                    numeros.remove(i);
                }
            }

            for (Integer i : numeros) {
                System.out.println(i);
            }
        }
    }

    public static class DividePorCero {

        public static void main(String[] args) {
            try {
                var resultado = division(5, 0);
                System.out.println(resultado);
            } catch (ArithmeticException e) {
                System.out.println("Esto no puede hacerse: " + e.getMessage());
            } finally {
                System.out.println("Demo de código");
            }
        }

        public static int division(int a, int b) throws ArithmeticException {
            return a / b;
        }
    }

    public static class CopiaFunc {
        public static void main(String[] args) {
            InputStream archivo = null;
            PrintStream destino = null;
            try {
                archivo = new FileInputStream("C:\\Users\\SidneyRobot\\Downloads\\Diploma Introducción a la programación.pdf");
                destino = new PrintStream(new FileOutputStream("C:\\Users\\SidneyRobot\\Downloads\\Diploma Copia Func.pdf"));
            } catch (FileNotFoundException e) {
                System.out.println("No se encontro el archivo" + e.getMessage());
            }

            copia(archivo, destino);
        }

        public static void copia(InputStream fileIn, PrintStream fileOut) {
            try {
                int c;
                while ((c = fileIn.read()) != -1) {
                    fileOut.write(c);
                }
            } catch (FileNotFoundException e) {
                System.out.println("No se encontro el archivo: " + e.getMessage());
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
