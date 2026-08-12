package com.paul.testing;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalificacionTest {

    Calificacion calificacion = new Calificacion();


    @Test
    public void testCalcularPromedio_15_14_16() {
        assertEquals(15.0, calificacion.calcularPromedio(15, 14, 16), 0.001);
    }

    @Test
    public void testCalcularPromedio_10_12_14() {
        assertEquals(12.0, calificacion.calcularPromedio(10, 12, 14), 0.001);
    }

    @Test
    public void testCalcularPromedio_20_18_16() {
        assertEquals(18.0, calificacion.calcularPromedio(20, 18, 16), 0.001);
    }

    @Test
    public void testEstaAprobado_promedio15_true() {
        assertTrue(calificacion.estaAprobado(15));
    }

    @Test
    public void testEstaAprobado_promedio13_limiteTrue() {
        assertTrue(calificacion.estaAprobado(13));
    }

    @Test
    public void testEstaAprobado_promedio12_false() {
        assertFalse(calificacion.estaAprobado(12));
    }

    @Test
    public void testEstaAprobado_promedio5_false() {
        assertFalse(calificacion.estaAprobado(5));
    }

    // --- RETO: Octavo caso de prueba ---

    @Test
    public void testEstaAprobado_promedio0_false() {
        // Valor mínimo extremo: verifica que el sistema no falla con nota 0
        assertFalse(calificacion.estaAprobado(0));
    }
}
