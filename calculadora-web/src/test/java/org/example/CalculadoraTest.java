package org.example;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class CalculadoraTest {

    Calculadora calc = new Calculadora();

    @Test
    void testSomar() {
        assertEquals(10, calc.somar(4, 6));
    }

    @Test
    void testSubtrair() {
        assertEquals(5, calc.subtrair(10, 5));
    }

    @Test
    void testMultiplicar() {
        assertEquals(5.0, calc.multiplicar(2.5, 2), 0.0001);
    }

    @Test
    void testDividir() {
        assertEquals(5, calc.dividir(10, 2));
    }

    @Test
    void testDividirPorZero() {
        assertThrows(ArithmeticException.class, () -> {
            calc.dividir(10, 0);
        });
    }
}