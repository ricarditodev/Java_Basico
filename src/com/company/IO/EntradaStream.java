package com.company.IO;

import java.io.*;

public class EntradaStream {
    public static void main(String[] args) {
        try {
            InputStream fichero = new FileInputStream("C:\\Users\\SidneyRobot\\Downloads\\Diploma Introducción a la programación.pdf");
            BufferedInputStream ficheroBuffer = new BufferedInputStream(fichero);

            try {
                byte[] datos = ficheroBuffer.readAllBytes();

                for (byte dato : datos) {
                    System.out.println((char) dato);
                }
            } catch (IOException e) {
                System.out.println("No puedo leer el mensaje " + e.getMessage());
            }
        } catch (FileNotFoundException e) {
            System.out.println("Error " + e.getMessage());
        }

    }
}
