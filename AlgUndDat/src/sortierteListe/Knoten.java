/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sortierteListe;

/**
 *
 * @author K
 */
public class Knoten {

    private int wert;
    private Knoten naechster;

    public Knoten(int inhalt) {
        wert = inhalt;
    }

    public Knoten naechsterGeben() {
        return naechster;
    }

    public void naechsterSetzen(Knoten k) {
        naechster = k;
    }

    public int wertGeben() {
        return wert;
    }

}
