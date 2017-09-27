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
public class Liste {

    public int anzahl;
    public Knoten erster;

    public Liste() {
        erster = null;
    }

    /*
    @return gibt die Anzahl aller Knoten wieder
     */
    public int anzahlGeben() {

        return anzahl;
    }

    /*
    return: Anzahl aller Elemente in der Liste
     */

    public Knoten erstenGeben() {
        return null;
    }

    public Knoten knotenGeben(int position) {
        return null;
    }

    /**
     * Sucht die Position eines Knotens k in der Liste.
     *
     * @param k Knoten, der in der Liste gesucht werden soll
     * @return -1, wenn der Knoten nicht in der Lste vorkommt oder wenn die
     * Liste leer ist. Sonst eine Zahl, die die Position des Knotens darstellt.
     */
    public int positionSuchen(Knoten k) {
        if (anzahlGeben() == 0) {
            return -1;
        }
        Knoten vergleich = erstenGeben();
        for (int i = 1; i <= anzahlGeben(); i = i + 1) {
            if (vergleich.equals(k)) {
                return i;
            }
            vergleich = vergleich.naechsterGeben();
        }
        //k kommt nicht vor, der Vergleich mit allen Knoten ist negativ gewesen
        return -1;
    }

    public void obenEinfuegen(Knoten k) {

    }

    /**
     * gibt den obersten Knoten der Liste zurück und entfernt diesen aus der
     * Liste. Der vormalig 2. Knoten ist nun also der neue erste Knoten.
     *
     * @return der oberste Knoten oder null, wenn die Liste leer ist.
     */
    public Knoten obenEntnehmen() {
        Knoten knotenAlt = erster;
        if (erster == null) {
            return null;
        } else {
            erster = erster.naechsterGeben(); //Wenn der nachfolger des ersten Knoten null war, dann ist die Liste nun leer.
            anzahl = anzahl - 1;
        }
        return knotenAlt;
    }

    public void listenInhaltGeben() {
        return;
    }

    /**
     * Liste Inhalt geben: gibt inhalt der Liste aus?
     */
    public void anzahlAktualisieren() {

    }
}
