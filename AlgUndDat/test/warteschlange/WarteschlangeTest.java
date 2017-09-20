/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package warteschlange;

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
public class WarteschlangeTest {
    
    public WarteschlangeTest() {
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
        Warteschlange instance = new Warteschlange();
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
        Warteschlange instance = new Warteschlange();
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
        Warteschlange instance = new Warteschlange();
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
        Warteschlange instance = new Warteschlange();
        Warteschlange instance2 = new Warteschlange();
        instance2.hintenEinfuegen(new Object());
        instance2.hintenEinfuegen(new Object());
        boolean expResult1 = true;
        boolean expResult2 = false;
        boolean result1 = instance.istLeer();
        boolean result2 = instance2.istLeer();
        assertEquals(expResult1, result1);
        assertEquals(expResult2, result2);
    }
    
}
