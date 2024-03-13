package org.example;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    public CalculatorTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Test
    @DisplayName("Add two numbers")
    void add() {
        assertEquals(4, Calculator.add(2, 2));
    }

    @Test
    @DisplayName("Multiply two numbers")
    void multiply() {
        assertAll(() -> assertEquals(4, Calculator.multiply(2, 2)),
                () -> assertEquals(-4, Calculator.multiply(2, -2)),
                () -> assertEquals(4, Calculator.multiply(-2, -2)),
                () -> assertEquals(0, Calculator.multiply(1, 0)));
    }

    /**
     * Tests of max method, of class MasGrande.
     */
    @Test
    public void testMax() {
        System.out.println("Prueba Max normal");
        int[] a = new int[3];
        a[0] = 3;
        a[1] = 4;
        a[2] = 5;
        int expResult = 5;
        int result = Calculator.max(a);
        assertEquals(expResult, result);
    }

    @Test
    public void testMaxOrder() {
        System.out.println("Prueba Max orden");
        int[] a = new int[3];
        a[0] = 4;
        a[1] = 5;
        a[2] = 3;
        int expResult = 5;
        int result = Calculator.max(a);
        assertEquals(expResult, result);
    }

    @Test
    public void testMaxSingleNumberArray() {
        System.out.println("Prueba Max solo un numero");
        int[] a = new int[1];
        a[0] = 3;
        int expResult = 3;
        int result = Calculator.max(a);
        assertEquals(expResult, result);
    }

    //Devuelve 0 en lugar de el resultado esperado si solo hay 1 numero positivo o ningun numero positivo
    @Test
    public void testMaxNegativeNumbers() {
        System.out.println("Prueba Max numeros negativos");
        int[] a = new int[3];
        a[0] = -3;
        a[1] = -4;
        a[2] = -5;
        int expResult = -3;
        int result = Calculator.max(a);
        assertEquals(expResult, result);
    }

    @Test
    public void testMaxEmpty() {
        System.out.println("Prueba Max vacio");
        int[] a = new int[0];
        int expResult = 0;
        int result = Calculator.max(a);
        assertEquals(expResult, result);
    }

    @Test
    public void testMaxNull() {
        System.out.println("Prueba Max array null");
        int[] a = null;
        int expResult = 0;
        int result = Calculator.max(a);
        assertEquals(expResult, result);
    }
}