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

    public Liste testListeErzeugen() {
        Element e1 = new Element("Ananas");
        Element e2 = new Element("Birne");
        Element e3 = new Element("Citrone");
        Element e4 = new Element("Dattel");
        Knoten k1 = new Knoten(e1);
        Knoten k2 = new Knoten(e2);
        k1.naechsterSetzen(k2);
        Knoten k3 = new Knoten(e3);
        k2.naechsterSetzen(k3);
        Knoten k4 = new Knoten(e4);
        k3.naechsterSetzen(k4);
        Liste testListe = new Liste();
        testListe.erster = k1;
        return testListe;
    }

    /**
     * Test of anzahlGeben method, of class Liste.
     */
    @Test
    public void testAnzahlGeben() {
        t3AnzahlGeben();
        t7AnzahlGeben();
    }

    public void t7AnzahlGeben() {
        System.out.println("anzahlGeben - Testfall 7");
        Liste instance = testListeErzeugen();
        int expResult = 4;
        int result = instance.anzahlGeben();
        assertEquals(expResult, result);
    }

    public void t3AnzahlGeben() {
        System.out.println("anzahlGeben - Testfall 3");
        Liste instance = new Liste();
        int expResult = 0;
        int result = instance.anzahlGeben();
        assertEquals(expResult, result);
    }

    public void t5AnzahlGeben() {
        System.out.println("anzahlGeben - Testfall 5");
        Liste instance = new Liste();
        Element e = new Element("Test");
        Knoten knotena = new Knoten(e);
        Knoten knotenb = new Knoten(e);
        Knoten knotenc = new Knoten(e);
        Knoten knotend = new Knoten(e);

        instance.obenEinfuegen(knotena);
        instance.obenEinfuegen(knotenb);
        instance.obenEinfuegen(knotenc);
        instance.obenEinfuegen(knotend);

        knotena.naechsterSetzen(knotenb);
        knotenb.naechsterSetzen(knotenc);
        knotenc.naechsterSetzen(knotend);

        int expResult = 4;
        int result = instance.anzahlGeben();
        assertEquals(expResult, result);

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
        fail("This is a prototype!");
    }

    public void t7ErstenGeben() {
        System.out.println("erstenGeben - Testfall 7");
        Liste instance = new Liste(); //Randfall!! Liste ist leer!
        Knoten expResult = null;
        Knoten result = instance.erstenGeben();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    public void t5ErstenGeben() {
        System.out.println("erstenGeben - Testfall 5");
        Liste instance = new Liste();
        Element e = new Element("Test");
        Knoten knotena = new Knoten(e);
        Knoten knotenb = new Knoten(e);
        Knoten knotenc = new Knoten(e);
        Knoten knotend = new Knoten(e);

        instance.obenEinfuegen(knotena);
        instance.obenEinfuegen(knotenb);
        instance.obenEinfuegen(knotenc);
        instance.obenEinfuegen(knotend);

        knotena.naechsterSetzen(knotenb);
        knotenb.naechsterSetzen(knotenc);
        knotenc.naechsterSetzen(knotend);

        Knoten expResult = knotena;
        Knoten result = instance.erstenGeben();
        assertEquals(expResult, result);

    public void t3ErstenGeben() {
        System.out.println("erstenGeben - Testfall 3");
        Liste instance = new Liste();
        Element e1 = new Element("Apfel");
        Element e2 = new Element("Mango");
        Knoten k1 = new Knoten(e1);//*Neuer Knoten k1
        Knoten k2 = new Knoten(e2);  //*Neuer Knoten k2
        instance.obenEinfuegen(k2);
        instance.obenEinfuegen(k1);
        Knoten expResult = k1;
        Knoten result = instance.erstenGeben();
        assertEquals(expResult, result);
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

    public void t7KnotenGeben() {
        System.out.println("knotenGeben - Testfall 7");
        int position = 3;
        Liste instance = testListeErzeugen();
        Element e3 = new Element("Citrone");
        Element e4 = new Element("Dattel");
        Knoten k1 = new Knoten(e3); //Teilnachbau der Liste, ist aber nicht das identische Objekt.
        Knoten k2 = new Knoten(e4);
        k1.naechsterSetzen(k2);
        Knoten expResult = k1;
        Knoten result = instance.knotenGeben(position);
        assertEquals(expResult, result);
    }

    public void t5KnotenGeben() {
        System.out.println("knotenGeben - Testfall 5");
        int position = 3;
        Liste instance = new Liste();
        Element e = new Element("Test");
        Knoten knotena = new Knoten(e);
        Knoten knotenb = new Knoten(e);
        Knoten knotenc = new Knoten(e);
        Knoten knotend = new Knoten(e);

        instance.obenEinfuegen(knotena);
        instance.obenEinfuegen(knotenb);
        instance.obenEinfuegen(knotenc);
        instance.obenEinfuegen(knotend);

        knotena.naechsterSetzen(knotenb);
        knotenb.naechsterSetzen(knotenc);
        knotenc.naechsterSetzen(knotend);

        Knoten expResult = knotend;
        Knoten result = instance.knotenGeben(position);
        assertEquals(expResult, result);

    }

    public void t3KnotenGeben() {
        System.out.println("knotenGeben - Testfall 3");
        int position = 3;
        Liste instance = testListeErzeugen();
        Element e3 = new Element("Aprikose");
        Element e4 = new Element("Banane");
        Knoten k1 = new Knoten(e3); //Teilnachbau der Liste, ist aber nicht das identische Objekt.
        Knoten k2 = new Knoten(e4);
        k1.naechsterSetzen(k2);
        Knoten expResult = k1;
        Knoten result = instance.knotenGeben(position);
        assertEquals(expResult, result);
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

    public void t7PositionSuchen() {
        System.out.println("positionSuchen - Testfall 7");
        Liste instance = testListeErzeugen();
        Element e4 = new Element("Dattel");
        Knoten k = new Knoten(e4);
        int expResult = 4;
        int result = instance.positionSuchen(k);
        assertEquals(expResult, result);
    }

    public void t5PositionSuchen() {
        System.out.println("positionSuchen - Testfall 5");

        Liste instance = new Liste();
        Element e = new Element("Test");
        Element e2 = new Element("Suche");
        Knoten knotena = new Knoten(e);
        Knoten knotenb = new Knoten(e);
        Knoten knotenc = new Knoten(e2);
        Knoten knotend = new Knoten(e);

        Knoten k = knotenc;

        instance.obenEinfuegen(knotena);
        instance.obenEinfuegen(knotenb);
        instance.obenEinfuegen(knotenc);
        instance.obenEinfuegen(knotend);

        knotena.naechsterSetzen(knotenb);
        knotenb.naechsterSetzen(knotenc);
        knotenc.naechsterSetzen(knotend);

        int expResult = 3;
        int result = instance.positionSuchen(k);
        assertEquals(expResult, result);

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
