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
public class CalculadoraImplTest {
    private static CalculadoraImpl instance;
    public CalculadoraImplTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
        
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        instance = new CalculadoraImpl();
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of soma method, of class CalculadoraImpl.
     */
    @Test
    public void testSoma() {
        System.out.println("soma");
        double a = 5.0;
        double b = 8.3;
         double expResult = 13.3;
        double result = instance.soma(a, b);
        assertEquals(expResult, result, 2.0);
       
        
    }

    /**
     * Test of subtrai method, of class CalculadoraImpl.
     */
    @Test
    public void testSubtrai() {
        System.out.println("subtrai");
        double a = 2.0;
        double b = 5.0;
        double expResult = -3.0;
        double result = instance.subtrai(a, b);
        assertEquals(expResult, result, 2.0);

    }

    /**
     * Test of mulitplica method, of class CalculadoraImpl.
     */
    @Test
    public void testMulitplica() {
        System.out.println("mulitplica");
        double a = 6.0;
        double b = 5.0;
        double expResult = 30.0;
        double result = instance.mulitplica(a, b);
        assertEquals(expResult, result, 2.0);
      
    }

    /**
     * Test of divide method, of class CalculadoraImpl.
     */
    @Test(expected=DivisaoPorZeroException.class)
    public void testDivide() {
        System.out.println("divide");
        double a = 10.0;
        double b = 5.0;
        double expResult = 2.0;
        double result = instance.divide(a, b);
        assertEquals(expResult, result, 2.0);
      
    }
}
