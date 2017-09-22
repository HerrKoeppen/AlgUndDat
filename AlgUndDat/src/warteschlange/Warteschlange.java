/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package warteschlange;

/**
 *
 * @author K
 */
public class Warteschlange {

    int anzahl;
    Object[] dieWarteschlange;

    public Warteschlange() {
        dieWarteschlange = new Object[6];
        anzahl = 0;
    }

    /**
     * Fügt das Element o an erster freier Stelle von hinten ein
     *
     * @param o eingefuegtes Objekt
     */
    public void hintenEinfuegen(Object o) {
        if (anzahl == 6) {
            System.out.println("Fehler! Warteschlange voll!");
        } else {
            dieWarteschlange[anzahl] = o;
            anzahl = anzahl + 1;
        }
    }

    /**
     * gibt das Element in der Warteschlange an erster Stelle aus
     *
     * @return das vorderste Element der Warteschlage
     */
    public Object vorneEntnehmen() {

        Object firstObject = null;
        if (anzahl == 0) {
            System.out.println("Fehler: Kein Object in der Queue");
        } else {
            firstObject = dieWarteschlange[0];
            for (int i = 1; i < anzahl; i++) {
                dieWarteschlange[i - 1] = dieWarteschlange[i];

            }
            dieWarteschlange[anzahl - 1] = null;
            anzahl = anzahl - 1;

        }

        return firstObject;
    }

    /**
     * Gibt die Anzahl der gespeicherten Elemente innerhalb der Warteschlage aus
     *
     * @return Anzahl der Elemente, die sich momentan in der Warteschlage
     * befinden
     */
    public int anzahlGeben() {
        int ergebnis = anzahl;
        return ergebnis;
    }

    /**
     * beurteilt, ob die Warteschlange leer ist
     *
     * @return ein boolean, der anzeigt, ob Elemente in der Warteschlage sind.
     * true steht für eine leere Warteschlange
     */
    public boolean istLeer() {
        return (anzahl == 0);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }

}
