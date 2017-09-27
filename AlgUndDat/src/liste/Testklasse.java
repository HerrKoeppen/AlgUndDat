/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package liste;

/**
 *
 * @author hannah.claus
 */
public class Testklasse {
    public static void main(String[] args){
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
        
        testListe.anzahlAktualisieren();
    }
    
}
