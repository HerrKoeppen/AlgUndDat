/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package liste;

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
public class ListeTest {
    //TODO 5 verschiedene Testfälle pro Methode ergänzen. Jeden Testfall auslagern als t1Methodenname(), t2Methodenname,...

    public ListeTest() {
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
     * Test of anzahlGeben method, of class Liste.
     */
    @Test
    public void testAnzahlGeben() {
        System.out.println("anzahlGeben");
        Liste instance = new Liste();
        int expResult = 0;
        int result = instance.anzahlGeben();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of erstenGeben method, of class Liste.
     */
    @Test
    public void testErstenGeben() {
        System.out.println("erstenGeben");
        Liste instance = new Liste();
        Knoten expResult = null;
        Knoten result = instance.erstenGeben();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of knotenGeben method, of class Liste.
     */
    @Test
    public void testKnotenGeben() {
        System.out.println("knotenGeben");
        int position = 0;
        Liste instance = new Liste();
        Knoten expResult = null;
        Knoten result = instance.knotenGeben(position);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of positionSuchen method, of class Liste.
     */
    @Test
    public void testPositionSuchen() {
        System.out.println("positionSuchen");
        Knoten k = null;
        Liste instance = new Liste();
        int expResult = 0;
        int result = instance.positionSuchen(k);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of obenEinfuegen method, of class Liste.
     */
    @Test
    public void testObenEinfuegen() {
        System.out.println("obenEinfuegen");
        Knoten k = null;
        Liste instance = new Liste();
        instance.obenEinfuegen(k);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of obenEntnehmen method, of class Liste.
     */
    @Test
    public void testObenEntnehmen() {
        System.out.println("obenEntnehmen");
        Liste instance = new Liste();
        Knoten expResult = null;
        Knoten result = instance.obenEntnehmen();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of listenInhaltGeben method, of class Liste.
     */
    @Test
    public void testListenInhaltGeben() {
        System.out.println("listenInhaltGeben");
        Liste instance = new Liste();
        instance.listenInhaltGeben();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of anzahlAktualisieren method, of class Liste.
     */
    @Test
    public void testAnzahlAktualisieren() {
        System.out.println("anzahlAktualisieren");
        Liste instance = new Liste();
        instance.anzahlAktualisieren();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

}
