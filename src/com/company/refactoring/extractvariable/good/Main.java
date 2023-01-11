package com.company.refactoring.extractvariable.good;

import com.company.refactoring.extractvariable.bad.Order;

public class Main {

    void printProductPrice(Order order){
        //precio de los productos
        double quantityPrice = order.getPrice() * order.getQuantity();

        //descuento
        double offerPrice = order.getPrice() * order.getOffer();

        //precio de los productos con descuento incluido
        double precioFinal = quantityPrice - offerPrice;

        //precio del envio
        double precioEnvio = 0d;
        if (precioFinal < 100) {
            precioEnvio = 2.99d;
        }

        System.out.println(precioFinal + precioEnvio);
    }

}