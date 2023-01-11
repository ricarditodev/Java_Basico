package com.company.refactoring.extractmethod.good;

public class Main {

    void printHTML(){

        printHead();
        printBody();
        printFooter();

    }

    private static void printFooter() {
        System.out.println("This is the footer");
        System.out.println("script");
        System.out.println("copyright");
        System.out.println("");
    }

    private void printBody() {
    }

    private void printHead() {
    }
}
