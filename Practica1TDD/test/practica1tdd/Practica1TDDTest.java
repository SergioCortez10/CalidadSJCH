/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica1tdd;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Usuario
 */
public class Practica1TDDTest {
    
    public Practica1TDDTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of main method, of class Practica1TDD.
     */
    @Test
    public void testNumero1() {
        System.out.println("Unidades");
        int numero = 2;
        Practica1TDD instance = new Practica1TDD();
        String expResult = "Unidad";
        String result = instance.Numero(numero);
        assertEquals(expResult, result);  
        if(result != expResult){
        fail("The test case is a prototype.");
        }
    }
    @Test
    public void testNumero2() {
        System.out.println("Decenas");
        int numero = 22;
        Practica1TDD instance = new Practica1TDD();
        String expResult = "Decenas";
        String result = instance.Numero(numero);
        assertEquals(expResult, result);  
        if(result != expResult){
        fail("The test case is a prototype.");
        }
    }
    @Test
    public void testNumero3() {
        System.out.println("Centenas");
        int numero = 236;
        Practica1TDD instance = new Practica1TDD();
        String expResult = "Centenas";
        String result = instance.Numero(numero);
        assertEquals(expResult, result);  
        if(result != expResult){
        fail("The test case is a prototype.");
        }
    }
    @Test
    public void testNumero4() {
        System.out.println("Unidad de mil");
        int numero = 4432;
        Practica1TDD instance = new Practica1TDD();
        String expResult = "Unidad de mil";
        String result = instance.Numero(numero);
        assertEquals(expResult, result);  
        if(result != expResult){
        fail("The test case is a prototype.");
        }
    }
    
}
