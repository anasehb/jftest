package com.example.anas_elboujjoufi_jft;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {

    private Calculator calculator;

    @BeforeEach
    void setUp() {
        calculator = new Calculator();
    }

    @Test
    void testTafelVan() {
        int[] resultaat = calculator.tafelVan(2);

        assertArrayEquals(new int[]{2, 4, 6, 8, 10, 12, 14, 16, 18, 20}, resultaat);
    }

    @Test
    void testTafelVanMetOngeldigeInvoer() {
        assertThrows(ArithmeticException.class, () -> calculator.tafelVan(0));
    }
}
