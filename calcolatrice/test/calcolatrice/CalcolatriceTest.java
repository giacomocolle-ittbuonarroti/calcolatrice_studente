/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calcolatrice;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author giacomo.colle
 */
public class CalcolatriceTest {
    
    public CalcolatriceTest() {
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
     * Test of somma method, of class Calcolatrice.
     */
    @Test
    public void testSomma1() {
        System.out.println("somma1");
        int num1 = 1;
        int num2 = 2;
        Calcolatrice instance = new Calcolatrice();
        int expResult = 3;
        int result = instance.somma(num1, num2);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    /**
     * Test of somma method, of class Calcolatrice.
     */
    @Test
    public void testSomma2() {
        System.out.println("somma2");
        int num1 = 2;
        int num2 = 2;
        Calcolatrice instance = new Calcolatrice();
        int expResult = 4;
        int result = instance.somma(num1, num2);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
