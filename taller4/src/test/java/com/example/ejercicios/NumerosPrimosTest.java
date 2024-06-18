package com.example.ejercicios;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NumerosPrimosTest {

    private NumerosPrimos numerosPrimos;

    @BeforeEach
    public void setUp() {
        numerosPrimos = new NumerosPrimos();
    }

    @AfterEach
    public void tearDown() {

    }

    @Test
    public void testNumeroPrimo() {
        assertTrue(numerosPrimos.numeroPrimo(3));
        assertTrue(numerosPrimos.numeroPrimo(5));
        assertFalse(numerosPrimos.numeroPrimo(4));
        assertFalse(numerosPrimos.numeroPrimo(1));
        assertFalse(numerosPrimos.numeroPrimo(0));
        assertFalse(numerosPrimos.numeroPrimo(-3));
    }
}
