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

    public int tiefe(Knoten ast) {
        if (ast == null) {
            return 0;
        } else {
            return 1 + (Math.max(tiefe(ast.links), tiefe(ast.rechts)));
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
        } else {
            if (referenz.links == null) {
                referenz.links = new Knoten(wert);
            } else if (referenz.rechts == null) {
                referenz.rechts = new Knoten(wert);
            } else if (tiefe(referenz.links) <= tiefe(referenz.rechts)) {
                fuegeEinNachTiefeRek(referenz.links, wert);
            } else {
                fuegeEinNachTiefeRek(referenz.rechts, wert);
            }
        }
    }
} // class BinaerBaum

