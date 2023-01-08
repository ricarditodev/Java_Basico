package com.company.poo.tarea;

public class Main {
    public static void main(String[] args) {
        SmartPhone samsung = new SmartPhone("Samsung", "Galaxy", true, true, true, "5G", 5000, "android", 13, 48);
        SmartWatch applewatch = new SmartWatch("apple", "appleWatch", false, false, true, "5G", 2000, "apppleOS", 8, true);
        System.out.println("Tu celular es: " + samsung + "\nTu smartwatch es: " + applewatch);
    }
}
