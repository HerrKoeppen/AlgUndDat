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
    /**
     * Das erste Object in der Liste wird gegeben
     *
     * @return
     */
    public Knoten erstenGeben() {
        return erster;
    }

    /**
     * gibt die position des Knoten wieder.
     * @param position
     * @return 
     */
    
    public Knoten knotenGeben(int position) {
        if (( position < 1) || (position > anzahl)) {
            System.out.println("Fehler");
            return null;
        }
        Knoten k = erster;
        for(int i = 1; i < position - 1; i++) {
            k = k.naechsterGeben ();
        }
        return k;
        
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

    
    /** Fügt Knoten K als in die Liste ein ( an erster Stelle)
     * 
     */ 
    public void obenEinfuegen(Knoten k) {
    k.naechsterSetzen(erstenGeben()); // hängt körbe an Knoten K
    erster = k;                       // Hängt K ans Stativ ( setzt k als neues erstes element
    anzahl = anzahl +1;               // Aktualisiert Anzahl
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

    /**
     * Rückgabe-methode
     * druckt nach einander knoten und dazugehörigen Element aus
     */
    public void listenInhaltGeben() {
    boolean t = false;            // Bedingung für whileschleife (gibt es keinen Nächsten Knoten? )
    Knoten p = erstenGeben();     // erster knoten
    while (t == false){           
      System.out.println(p);      // druckt Knoten aus (nach reihenfolge)
      System.out.println(p.e);    // gibt dazugehöriges Element aus
      p = p.naechsterGeben();     // 
      if (p == null) {            //prüft auf nächsten knoten, wenn nicht existent: leitet ende ein
       t = true;    
      }
    }
    }
   
    /**
     * Überprüft die Anzahl der Elemente in der Liste und überschreibt den Wert
     * anzahl.
     */
    public void anzahlAktualisieren() {
        System.out.println("Es befinden sich jetzt " + anzahl + " Objekte in der Liste.");
    }
}





   
    
