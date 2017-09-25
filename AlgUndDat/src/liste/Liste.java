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

    public Liste() {
    }
    
    public int anzahlGeben() {
        return -1;
    }

    public Knoten erstenGeben() {
        return null;
    }

    public Knoten knotenGeben(int position) {
        return null;
    }
    /**
     * Sucht die Position eines Knotens k in der Liste.
     * @param k Knoten, der in der Liste gesucht werden soll
     * @return -1, wenn der Knoten nicht in der Lste vorkommt oder wenn die Liste leer ist. Sonst eine Zahl, die die Position des Knotens darstellt.
     */
    public int positionSuchen(Knoten k) {
        if (anzahlGeben()==0){
            return -1;
        }
        Knoten erster = erstenGeben();
        
    }

    public void obenEinfuegen(Knoten k) {
    
    }

    /**
     * gibt den obersten Knoten der Liste zurück
     *
     * @return der oberste Knoten oder null, wenn die Liste leer ist.
     */
    public Knoten obenEntnehmen() {
        return null;

    }

    public void listenInhaltGeben() {
        return;
    }
/** Liste Inhalt geben:
 *  gibt inhalt der Liste aus?
 */
    public void anzahlAktualisieren() {
        
    }
}
