/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package warteschlage;

/**
 *
 * @author K
 */
public class Warteschlage {
    int anzahl;
    Object[] dieWarteschlange;
    public Warteschlage(int elementAnzahl){
        //TODO add some Code
    }
    /**
     * Fügt das Element o an erster freier Stelle von hinten ein
     * @param o eingefuegtes Objekt
     */
    public void hintenEinfuegen(Object o){
        
    }
    /**
     * gibt das Element in der Warteschlange an erster Stelle aus
     * @return das vorderste Element der Warteschlage
     */
    public Object vorneEntnehmen(){
       return null; 
    }
    /**
     * Gibt die Anzahl der gespeicherten Elemente innerhalb der Warteschlage aus
     * @return Anzahl der Elemente, die sich momentan in der Warteschlage befinden
     */
    public int anzahlGeben(){
        return -1;
    }
    /**
     * beurteilt, ob die Warteschlange leer ist
     * @return ein boolean, der anzeigt, ob Elemente in der Warteschlage sind. true steht für eine leere Warteschlange
     */
    public boolean istLeer(){
        return false;
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
