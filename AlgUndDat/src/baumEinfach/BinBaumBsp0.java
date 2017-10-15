/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baumEinfach;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author K
 */
public class BinBaumBsp0 // ----------------------------------
{

    public void ablaufen() {
        BinaerBaum baum2 = new BinaerBaum();
        Knoten[] dieKnoten = new Knoten[20];
        for (int i = 0; i < 20; i++) {
            dieKnoten[i] = new Knoten(i);
            baum2.fuegeEinNachTiefe(dieKnoten[i]);
        }
        baum2.laufeDurch();
        System.out.println(baum2.tiefe(baum2.wurzel));
    }

    public static void main(String[] arg) {
        BinaerBaum baum = new BinaerBaum();
        int zahl = 0;
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        baum = new BinaerBaum();
        System.out.print("Bitte Zahlen eingeben. Ende mit -1.");
        System.out.println();
        while (zahl != -1) {
            System.out.print("Bitte Zahl eingeben: ");
            try {
                zahl = Integer.parseInt(in.readLine());
            } catch (IOException ex) {
                Logger.getLogger(BinBaumBsp0.class.getName()).log(Level.SEVERE, null, ex);
            }
            if (zahl != -1) {
                baum.fuegeEin(zahl);
            }
        } // while
        baum.laufeDurch();
        System.out.println(baum.tiefe(baum.wurzel));
    }

}
