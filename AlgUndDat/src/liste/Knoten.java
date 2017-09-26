/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package liste;

/**
 *
 * @author K
 */
public class Knoten {

    Element e;
    Knoten naechster;

    public Knoten(Element inhalt) {
        e = inhalt;
        naechster = null;
    }
    public Knoten(Element inhalt, Knoten derNaechste){
        e = inhalt;
        naechster = derNaechste;
    }

    public void naechsterSetzen(Knoten k) {
        naechster = k;
    }

    public Knoten naechsterGeben() {
        return naechster;
    }

}
