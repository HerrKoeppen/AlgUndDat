/*
Die sortierte Liste speichert aufsteigend geordnet Knoten mit Ganzzahlen.
Alle Methoden sind möglichst rekursive Listenmethoden.
 */
package sortierteListe;

/**
 *
 * @author K
 */
public class sortierteListe {

    private Knoten wurzel;

    public sortierteListe() {
        wurzel = null;
    }

    /**
     * die Methode fügt einen Knoten k rekursiv sortiert in eine Liste ein.
     * Dafür wird eine Hilfsmethode benutzt, die die Liste rekursiv ab der
     * Wurzel durcharbeitet. Die Liste ist anschließend wieder aufsteigend
     * sortiert.
     *
     * @param k eingefügter Knoten
     */
    public void sortiertEinfuegen(Knoten k) {
        if (wurzel == null) {
            wurzel = k;
            return;
        }
        if (k.wertGeben() <= wurzel.wertGeben()) {
            k.naechsterSetzen(wurzel);
            wurzel = k;
            return;
        }
        sortiertEinfuegenRek(k, wurzel);

    }

    void sortiertEinfuegenRek(Knoten k, Knoten referenz) {
        if (referenz.naechsterGeben() == null) {
            referenz.naechsterSetzen(k);
            return;
        }
        if (referenz.naechsterGeben().wertGeben() <= k.wertGeben()) {
            sortiertEinfuegenRek(k, referenz.naechsterGeben());
            return;
        }
        if (referenz.naechsterGeben().wertGeben() > k.wertGeben()) {
            k.naechsterSetzen(referenz.naechsterGeben());
            referenz.naechsterSetzen(k);
            return;
        }
    }

    public Knoten knotenGeben(int position) {
        return null;
    }

    // Die Liste ist sortiert!!
    public int positionSuchen(Knoten k) {
        return -1;
    }

    public void listenInhaltGeben() {
        if (wurzel != null) {
            listenInhaltGebenRek(wurzel);
        } else {
            System.out.println("Liste ist leer.");
        }
    }

    public void listenInhaltGebenRek(Knoten referenz) {
        if (referenz.naechsterGeben() != null) {
            System.out.println(referenz.wertGeben());
            listenInhaltGebenRek(referenz.naechsterGeben());
        } else {
            System.out.println(referenz.wertGeben());
        }
    }

    public int zaehleknotenInListe() {
        if(wurzel != null){
        
        return zahleknotenInListeRek(wurzel);}
        else{
            return 0;}

        //return -1;
    }

    public int zahleknotenInListeRek(Knoten referenz) {
        if (referenz.naechsterGeben() != null) {
            return (1 + zahleknotenInListeRek(referenz.naechsterGeben()));
        }
        return 1;

    }

    public int summeListe() {
        return -1;
    }

    public int produktListe() {
        return -1;
    }

    public Knoten obenEntnehmen() {
        Knoten knotenAlt = wurzel;
        if (wurzel == null) {
            return null;
        } else {
            wurzel = wurzel.naechsterGeben();
        }
        return knotenAlt;
    }

    public static void main(String[] args) {
        sortierteListe s = new sortierteListe();
        Knoten k1 = new Knoten(1);
        Knoten k2 = new Knoten(3);
        Knoten k3 = new Knoten(5);
        Knoten k4 = new Knoten(7);

        s.sortiertEinfuegen(k4);
        s.sortiertEinfuegen(k3);
        s.sortiertEinfuegen(k2);
        s.sortiertEinfuegen(k1);
        System.out.println();

        s.listenInhaltGeben();
        System.out.println(s.zaehleknotenInListe());
        
    }

}
