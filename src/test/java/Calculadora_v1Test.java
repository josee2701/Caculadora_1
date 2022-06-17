/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Fernando
 */
public class Calculadora_v1Test {
    
    public Calculadora_v1Test() {
    }

    @org.junit.jupiter.api.BeforeAll
    public static void setUpClass() throws Exception {
    }

    @org.junit.jupiter.api.AfterAll
    public static void tearDownClass() throws Exception {
    }

    @org.junit.jupiter.api.BeforeEach
    public void setUp() throws Exception {
    }

    @org.junit.jupiter.api.AfterEach
    public void tearDown() throws Exception {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of sumar method, of class Calculadora_v1.
     */
    @org.junit.jupiter.api.Test
    public void testSumar() {
        System.out.println("sumar");
        double x = 0.0;
        double y = 0.0;
        Calculadora_v1 instance = new Calculadora_v1();
        double expResult = 0.0;
        double result = instance.sumar(x, y);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of restar method, of class Calculadora_v1.
     */
    @org.junit.jupiter.api.Test
    public void testRestar() {
        System.out.println("restar");
        double x = 0.0;
        double y = 0.0;
        Calculadora_v1 instance = new Calculadora_v1();
        double expResult = 0.0;
        double result = instance.restar(x, y);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of multiplicar method, of class Calculadora_v1.
     */
    @org.junit.jupiter.api.Test
    public void testMultiplicar() {
        System.out.println("multiplicar");
        double x = 0.0;
        double y = 0.0;
        Calculadora_v1 instance = new Calculadora_v1();
        double expResult = 0.0;
        double result = instance.multiplicar(x, y);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of dividir method, of class Calculadora_v1.
     */
    @org.junit.jupiter.api.Test
    public void testDividir() {
        System.out.println("dividir");
        double x = 0.0;
        double y = 0.0;
        Calculadora_v1 instance = new Calculadora_v1();
        double expResult = 0.0;
        double result = instance.dividir(x, y);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
