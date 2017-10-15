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
public class Knoten // ---------------------------------------
{

    int inhalt;
    Knoten links, rechts;

    Knoten(int wert) {
        this.inhalt = wert;
        this.links = null;
        this.rechts = null;
    }
}
