/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Luciano
 */
public class RaizQuadradaTest {
    static RaizQuadrada instance;
    
    public RaizQuadradaTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
        instance = new RaizQuadrada();
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
     * Test of getRaiz method, of class RaizQuadrada.
     */
    @Test
    public void testGetRaiz() {
        System.out.println("getRaiz");
        double numero = 16.0;
        double expResult = 4.0;
        double result = instance.getRaiz(numero);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
        System.out.println(result);
    }

    /**
     * Test of isPar method, of class RaizQuadrada.
     */
    @Test
    public void testIsPar() {
        System.out.println("isPar");
        double numero = 5.0;
        boolean expResult = false;
        boolean result = instance.isPar(numero);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }
}
