/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baum;

/**
 *
 * @author K
 */
public class Ahnenbaum {
 private Baumelement wurzel;
    public Ahnenbaum() {
        wurzel = new Abschluss();
    }
    public void wurzelSetzen(Baumelement w){
        wurzel=w;
    }
    public Baumelement wurzelGeben() {
        return wurzel;
    }
    public int anzahlDatenknotenGeben(){
       return wurzel.anzahlDatenknotenGeben();
    }
    public void alleDatenAusgeben() {
        System.out.println("Inorder:");
        wurzel.baumdatenAusgeben();
        System.out.println("Preorder:");
        wurzel.baumdatenAusgebenPre();
        System.out.println("Postorder:");
        wurzel.baumdatenAusgebenPost();
    }       
}
