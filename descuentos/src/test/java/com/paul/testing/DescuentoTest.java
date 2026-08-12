package com.paul.testing;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class DescuentoTest {

    Descuento descuento = new Descuento();

    // Caso 1: precio 100, descuento 10%
    @Test
    public void testPrecio100_descuento10_retorna90() {
        assertEquals(90.0, descuento.calcularPrecioFinal(100, 10), 0.001);
    }

    // Caso 2: precio 200, descuento 20%
    @Test
    public void testPrecio200_descuento20_retorna160() {
        assertEquals(160.0, descuento.calcularPrecioFinal(200, 20), 0.001);
    }

    // Caso 3: precio 50, descuento 0%
    @Test
    public void testPrecio50_descuento0_retorna50() {
        assertEquals(50.0, descuento.calcularPrecioFinal(50, 0), 0.001);
    }

    // Caso 4: precio 500, descuento 50%
    @Test
    public void testPrecio500_descuento50_retorna250() {
        assertEquals(250.0, descuento.calcularPrecioFinal(500, 50), 0.001);
    }

    // Caso 5: precio 300, descuento 100%
    // Justificación: probar el límite máximo del descuento (100%).
    // Un descuento del 100% debe resultar en precio final 0, no negativo.
    @Test
    public void testPrecio300_descuento100_retorna0() {
        assertEquals(0.0, descuento.calcularPrecioFinal(300, 100), 0.001);
    }
}
