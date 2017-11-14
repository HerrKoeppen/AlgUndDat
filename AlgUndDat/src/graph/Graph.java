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
    private boolean istFertig;

    public Graph(int m) {
        maxAnzahl = m;
        anzahl = 0;
        knotenliste = new Knoten[m];
        adjazenzmatrix = new boolean[m][m];
    }

    public void knotenEinfuegen(Knoten k) {
        if (anzahl < maxAnzahl) {
            knotenliste[anzahl] = k;
            anzahl = anzahl + 1;
        }
    }

    public void kanteEinfuegen(int i, int j) {
        if (Math.max(i, j) <= anzahl) {
            adjazenzmatrix[i][j] = true;
        }
    }

    public void kanteEntfernen(int i, int j) {
        if (Math.max(i, j) <= anzahl) {
            adjazenzmatrix[i][j] = false;
        }
    }

    public int knotenIndexSuchen(Knoten k) {
        for (int i = 0; i < anzahl; i++) {
            if (knotenliste[i] == k) {
                return i;
            }
        }
        return -1;
    }

    public void adjazenzmatrixAusgeben() {
        String ausgabe = "\t";
        for (int i = 0; i < anzahl; i++) {
            ausgabe += knotenliste[i].gibWert() + "\t";
        }
        ausgabe += "\n";
        for (int i = 0; i < anzahl; i++) {
            ausgabe += knotenliste[i].gibWert() + "\t";
            for (int j = 0; j < anzahl; j++) {
                if (adjazenzmatrix[i][j] == true) {
                    ausgabe += "X\t";
                } else {
                    ausgabe += " \t";
                }
            }
            ausgabe += "\n\n";
        }
        System.out.println(ausgabe);
    }

    public void knotenlisteAusgeben() {
        String ausgabe = "";
        for (int i = 0; i < anzahl; i++) {
            ausgabe += knotenliste[i].gibWert() + "\t";
        }
        System.out.println(ausgabe);
    }

    public void tiefensuche(int startNr) {
        initialisierungGraphTiefensuche();
        tiefensucheKnoten(startNr);
    }

    public void initialisierungGraphTiefensuche() {
        for (int i = 0; i < anzahl; i++) {
            knotenliste[i].initialisierungKnotenTiefensuche();
        }
    }

    private void tiefensucheKnoten(int vIndex) {
        knotenliste[vIndex].setzeMarkierung(true);
        System.out.print("[");
        System.out.print(knotenliste[vIndex].gibWert());
        System.out.print(" ");
        for (int i = 0; i < anzahl; i++) {
            if (adjazenzmatrix[vIndex][i] && !knotenliste[i].gibMarkierung()) {
                tiefensucheKnoten(i);
            }
        }
        System.out.print(knotenliste[vIndex].gibWert());
        System.out.print("]");
    }

    public void tiefensuche(int startNr, int zielNr) {
        initialisierungGraphTiefensuche();
        tiefensucheKnoten(startNr, zielNr);
    }

    private void tiefensucheKnoten(int vIndex, int zielIndex) {
        knotenliste[vIndex].setzeMarkierung(true);
        System.out.print("[");
        System.out.print(knotenliste[vIndex].gibWert());
        System.out.print(" ");
        if (vIndex != zielIndex) {
            for (int i = 0; i < anzahl; i++) {
                if (adjazenzmatrix[vIndex][i] == true && knotenliste[i].gibMarkierung() == false) {
                    if (istFertig == false) {

                        tiefensucheKnoten(i, zielIndex);
                    }
                }
            }
        } else {
            System.out.print("ZIEL ERREICHT");
            istFertig = true;
        }
        System.out.print(knotenliste[vIndex].gibWert());
        System.out.print("]");
    }
}
