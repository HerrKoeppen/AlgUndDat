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
public class Knoten {
    private int wert;
    private boolean markierung; //nur für die Tiefensuche
    public Knoten(int inhalt){
        wert = inhalt;
        markierung = false;
    }
    public int gibWert(){
        return wert;
    }
    
    public boolean gibMarkierung(){
        return markierung;
    }
    
    public void setzeMarkierung(boolean b){
        markierung = b;
    }
    
    public void initialisierungKnotenTiefensuche(){
        markierung = false;
    }
}
