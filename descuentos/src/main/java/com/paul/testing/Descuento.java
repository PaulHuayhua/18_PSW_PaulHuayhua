package com.paul.testing;

public class Descuento {

    public double calcularPrecioFinal(double precio, double descuento) {
        return precio - (precio * descuento / 100);
        // return precio + (precio * descuento / 100); // BUG (usado para evidencia de fallo)
    }
}
