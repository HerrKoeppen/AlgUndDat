/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baumEinfach;

/**
 *
 * @author K
 */
public class BinaerBaum // ------------------------------------
{

    Knoten wurzel = null;

    //Sortiertes Einfügen!
    void rekFuegeEin(Knoten ast, int wert) {
        if (wert < ast.inhalt) { // links einfuegen
            if (ast.links == null) {
                ast.links = new Knoten(wert);
            } else {
                rekFuegeEin(ast.links, wert);
            }
        } else { // rechts einfuegen
            if (ast.rechts == null) {
                ast.rechts = new Knoten(wert);
            } else {
                rekFuegeEin(ast.rechts, wert);
            }
        }
    }

    //Sortiertes Einfügen!
    void fuegeEin(int wert) {
        if (wurzel == null) {
            wurzel = new Knoten(wert);
        } else {
            rekFuegeEin(wurzel, wert);
        }
    } // FuegeEin

    void rekLaufeDurch(Knoten ast) {
        if (ast != null) {
            rekLaufeDurch(ast.links);
            System.out.print(ast.inhalt);
            System.out.println();
            rekLaufeDurch(ast.rechts);
        }
    } // rekLaufeDurch

    void laufeDurch() {
        if (wurzel != null) {
            rekLaufeDurch(wurzel.links);
            System.out.print(wurzel.inhalt);
            System.out.println();
            rekLaufeDurch(wurzel.rechts);
        }
    } // laufeDurch

    void rekLaufeDurchFormat(Knoten ast, int tiefe) {
        if (ast != null) {
            rekLaufeDurchFormat(ast.links, tiefe + 1);
            String ausgabe = "";
            for (int i = 0; i < tiefe; i++) {
                ausgabe += "\t";
            }
            ausgabe += ast.inhalt;
            System.out.println(ausgabe);
            System.out.println();
            rekLaufeDurchFormat(ast.rechts, tiefe + 1);
        } else {
            String ausgabe = "";
            for (int i = 0; i < tiefe; i++) {
                ausgabe += "\t";
            }
            ausgabe += "X";
            System.out.println(ausgabe);
            System.out.println();
        }
    } // rekLaufeDurch

    void laufeDurchFormat() {
        if (wurzel != null) {
            rekLaufeDurchFormat(wurzel.links, 1);
            System.out.print(wurzel.inhalt);
            System.out.println();
            rekLaufeDurchFormat(wurzel.rechts, 1);
        }
    } // laufeDurch

    public int tiefe(Knoten ast) {
        if (ast == null) {
            return 0;
        } else {
            if (tiefe(ast.links) > tiefe(ast.rechts)) {
                return 1 + tiefe(ast.links);
            } else {
                return 1 + tiefe(ast.rechts);
            }
        }
    }

    //Balanciertes Einfügen!
    public void fuegeEinNachTiefe(int wert) {
        if (wurzel == null) {
            wurzel = new Knoten(wert);
        } else {
            fuegeEinNachTiefeRek(wurzel, wert);
        }
    }

    //Balanciertes Einfügen!
    public void fuegeEinNachTiefeRek(Knoten referenz, int wert) {
        if (referenz == null) {
            referenz = new Knoten(wert);
            return;
        }
        if (referenz.links == null) {
            referenz.links = new Knoten(wert);
            return;
        }
        if (referenz.rechts == null) {
            referenz.rechts = new Knoten(wert);
            return;
        }
        if (tiefe(referenz.links) < tiefe(referenz.rechts)) {
            fuegeEinNachTiefeRek(referenz.links, wert);
            return;
        }
        if (tiefe(referenz.links) >= tiefe(referenz.rechts)) {
            fuegeEinNachTiefeRek(referenz.rechts, wert);
            return;
        }

    }
} // class BinaerBaum

