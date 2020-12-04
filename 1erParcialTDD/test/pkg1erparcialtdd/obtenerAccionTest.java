/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg1erparcialtdd;

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
public class obtenerAccionTest {
    
    public obtenerAccionTest() {
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
     * Test of obtener method, of class obtenerAccion.
     */
    @Test
    public void testObtener() {
        System.out.println("obtener");
        boolean matriculando = false;
        obtenerAccion instance = new obtenerAccion();
        instance.obtener(matriculando);
    }

    /**
     * Test of obtener2 method, of class obtenerAccion.
     */
    @Test
    public void testObtener2() {
        System.out.println("obtener2");
        boolean matriculando = false;
        boolean registrado = false;
        obtenerAccion instance = new obtenerAccion();
        instance.obtener2(matriculando, registrado);

    }

    /**
     * Test of obtene3 method, of class obtenerAccion.
     */
    @Test
    public void testObtene3() {
        System.out.println("obtene3");
        boolean matriculando = false;
        boolean registro = false;
        boolean esDocente = false;
        obtenerAccion instance = new obtenerAccion();
        instance.obtene3(matriculando, registro, esDocente);
   
    }

    /**
     * Test of obtener4 method, of class obtenerAccion.
     */
    @Test
    public void testObtener4() {
        System.out.println("obtener4");
        boolean matriculando = false;
        boolean registro = false;
        boolean esDocente = false;
        String esObligatorio = "";
        obtenerAccion instance = new obtenerAccion();
        instance.obtener4(matriculando, registro, esDocente, esObligatorio);

    }

    /**
     * Test of obtener5 method, of class obtenerAccion.
     */
    @Test
    public void testObtener5() {
        System.out.println("obtener5");
        boolean matriculando = false;
        String esObligatorio = "";
        obtenerAccion instance = new obtenerAccion();
        instance.obtener5(matriculando, esObligatorio);

    }

    /**
     * Test of obtener6 method, of class obtenerAccion.
     */
    @Test
    public void testObtener6() {
        System.out.println("obtener6");
        boolean matriculando = false;
        boolean registro = false;
        boolean esDocente = false;
        boolean esInstitucion = false;
        boolean esExterno = false;
        obtenerAccion instance = new obtenerAccion();
        instance.obtener6(matriculando, registro, esDocente, esInstitucion, esExterno);

    }

    /**
     * Test of obtener7 method, of class obtenerAccion.
     */
    @Test
    public void testObtener7() {
        System.out.println("obtener7");
        boolean matricularse = false;
        boolean registro = false;
        obtenerAccion instance = new obtenerAccion();
        instance.obtener7(matricularse, registro);

    }

    /**
     * Test of obtener8 method, of class obtenerAccion.
     */
    @Test
    public void testObtener8() {
        System.out.println("obtener8");
        boolean matricularse = false;
        boolean esDocente = false;
        obtenerAccion instance = new obtenerAccion();
        instance.obtener8(matricularse, esDocente);
    }

    /**
     * Test of ontener9 method, of class obtenerAccion.
     */
    @Test
    public void testOntener9() {
        System.out.println("ontener9");
        boolean esDocente = false;
        String esObligatorio = "";
        boolean registro = false;
        obtenerAccion instance = new obtenerAccion();
        instance.ontener9(esDocente, esObligatorio, registro);
    }

    /**
     * Test of ontener10 method, of class obtenerAccion.
     */
    @Test
    public void testOntener10() {
        System.out.println("ontener10");
        boolean esDocente = false;
        String esObligatorio = "";
        boolean registro = false;
        obtenerAccion instance = new obtenerAccion();
        instance.ontener10(esDocente, esObligatorio, registro);
    }
    
}
