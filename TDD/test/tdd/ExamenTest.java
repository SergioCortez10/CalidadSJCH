/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tdd;

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
public class ExamenTest {
    
    @Test
    public void testSistemas() {
        Examen examen = new Examen();
        assertTrue(examen.Sistemas(22,12,12,14));
    }
    @Test
    public void testSistemas2() {
        Examen examen = new Examen();
        assertFalse(examen.Sistemas(12,3,5,6));
    }
    @Test
    public void testContaduria() {
        Examen examen = new Examen();
        assertFalse(examen.Contaduria(22,4,5));
    }
    @Test
    public void testContaduria2() {
        Examen examen = new Examen();
        assertTrue(examen.Contaduria(22,22,14));
    }
    
}
