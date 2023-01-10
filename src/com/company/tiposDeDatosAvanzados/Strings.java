package com.company.tiposDeDatosAvanzados;

public class Strings {
    public static void main(String[] args) {
        String texto = "HOLA MUNDO";

        String textoLowe = texto.toLowerCase();

        for (int i = 0; i < textoLowe.length(); i++) {
            System.out.println("El caracter actual es: " + textoLowe.charAt(i));
        }
    }
}
