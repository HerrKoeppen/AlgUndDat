/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graph;

/**
 *
 * @author koeppen
 */
public class Graph {
    private Knoten[] knotenliste;
    private boolean[][] adjazenzmatrix;
    private int maxAnzahl;
    private int anzahl;
    public Graph(int m){
        maxAnzahl = m;
        anzahl = 0;
        knotenliste = new Knoten[m];
        adjazenzmatrix = new boolean[m][m];
    }
}
