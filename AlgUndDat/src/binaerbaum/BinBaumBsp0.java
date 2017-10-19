/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package binaerbaum;

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

    public static void main(String[] arg) {
        BinaerBaum b3 = new BinaerBaum();
        /*
        Knoten k1,k2,k3,k4;
        k1 = new Knoten(4);
        k2 = new Knoten(2);
        k3 = new Knoten(16);
        k4 = new Knoten(7);
        b3.wurzel = k1;
        b3.wurzel.links = k2;
        b3.wurzel.rechts = k3;
        b3.wurzel.links.links = k4;
*/
        for (int i=0;i<20;i++){
            b3.fuegeEinNachTiefe(i);
        }
        System.out.println(b3.tiefe(b3.wurzel));
        b3.laufeDurchFormat();
    }

    public static void ablaufen2() {
        BinaerBaum baum2 = new BinaerBaum();
        //Knoten[] dieKnoten = new Knoten[20];
        for (int i = 0; i < 8; i++) {
            baum2.fuegeEinNachAnzahlElemente(i);
        }
        //System.out.println("InOrder-Traversierung: ");
        baum2.laufeDurchFormat();
        System.out.println();
        System.out.println("Tiefe: " + baum2.tiefe(baum2.wurzel));
    }

    public void ablaufen() {

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
                baum.fuegeEinNachAnzahlElemente(zahl);
            }
        } // while
        baum.laufeDurch();
        System.out.println(baum.tiefe(baum.wurzel));
    }

}
