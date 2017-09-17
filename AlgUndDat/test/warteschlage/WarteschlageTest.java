/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package warteschlage;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author K
 */
public class WarteschlageTest {
    
    public WarteschlageTest() {
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
     * Test of hintenEinfuegen method, of class Warteschlage.
     */
    @Test
    public void testHintenEinfuegen() {
        System.out.println("hintenEinfuegen");
        Object o = new Object();
        Warteschlage instance = new Warteschlage(1);
        instance.hintenEinfuegen(o);
        // TODO review the generated test code and remove the default call to fail.
        assertEquals(instance.vorneEntnehmen(),o);
    }

    /**
     * Test of vorneEntnehmen method, of class Warteschlage.
     */
    @Test
    public void testVorneEntnehmen() {
        System.out.println("vorneEntnehmen");
        Warteschlage instance = new Warteschlage(1);
        Object expResult = new Object();
        instance.hintenEinfuegen(expResult);
        Object result = instance.vorneEntnehmen();
        assertEquals(expResult, result);
    }

    /**
     * Test of anzahlGeben method, of class Warteschlage.
     */
    @Test
    public void testAnzahlGeben() {
        System.out.println("anzahlGeben");
        Warteschlage instance = new Warteschlage(5);
        instance.hintenEinfuegen(new Object());
        instance.hintenEinfuegen(new Object());
        instance.hintenEinfuegen(new Object());
        instance.hintenEinfuegen(new Object());
        instance.hintenEinfuegen(new Object());
        int expResult = 5;
        int result = instance.anzahlGeben();
        assertEquals(expResult, result);
    }

    /**
     * Test of istLeer method, of class Warteschlage.
     */
    @Test
    public void testIstLeer() {
        System.out.println("istLeer");
        Warteschlage instance = new Warteschlage(3);
        Warteschlage instance2 = new Warteschlage(3);
        instance2.hintenEinfuegen(new Object());
        instance2.hintenEinfuegen(new Object());
        boolean expResult1 = true;
        boolean expResult2 = false;
        boolean result1 = instance.istLeer();
        boolean result2 = instance2.istLeer();
        assertEquals(expResult1, result1);
        assertEquals(expResult2, result2);
    }

    /**
     * Test of main method, of class Warteschlage.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        Warteschlage.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
