/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author thomas
 */
public class BacteriaTest {
    
    public BacteriaTest() {
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
     * Test of getCount method, of class Bacteria.
     */
    @Test
    public void testGetCount() {
        System.out.println("getCount");
        Bacteria instance = new Bacteria();
        int expResult = 1;
        int result = instance.getCount();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setTemperature method, of class Bacteria.
     */
    @Test
    public void testSetTemperature() {
        System.out.println("setTemperature");
        double Temperature = 0.0;
        Bacteria instance = new Bacteria();
        instance.setTemperature(Temperature);
        assertEquals(Temperature, instance.Temperature,0); 
// TODO review the generated test code and remove the default call to fail.
        
    }
    
    @Test
    public void testSetTemperature20() {
        System.out.println("setTemperature20");
        double Temperature = 20.0;
        Bacteria instance = new Bacteria();
        instance.setTemperature(Temperature);
        instance.setTemperature(0.0);
        assertEquals(2, instance.getCount()); 
// TODO review the generated test code and remove the default call to fail.
        
    }
    }
