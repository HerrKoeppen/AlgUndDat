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
public class BinBaum {
    Baumelement wurzel;
    public String inorder(Baumelement b){
        if (b.wert.equals("abschluss")){
            return b.wert;
        }
        else{
            return "Linkes Kind: "+inorder(b.links)+" Mitte: "+b.wert+" Rechtes Kind: "+inorder(b.rechts);
        }
    }
    public String preorder(Baumelement b){
        if (b.wert.equals("abschluss")){
            return b.wert;
        }
        else{
            return "Mitte: "+b.wert+" Linkes Kind: "+preorder(b.links)+" Rechtes Kind: "+preorder(b.rechts);
        }
    }
    public String postorder(Baumelement b){
        if (b.wert.equals("abschluss")){
            return b.wert;
        }
        else{
            return "Linkes Kind: "+postorder(b.links)+" Rechtes Kind: "+postorder(b.rechts)+" Mitte: "+b.wert;
        }
    }
    public static void main(String[] args){
        BinBaum test = new BinBaum();
        Baumelement b1 = new Datenknoten();
        b1.wert = "1";
        Baumelement b2 = new Datenknoten();
        b2.wert = "2";
        Baumelement b3 = new Datenknoten();
        b3.wert = "3";
        Baumelement a = new Abschluss();
        test.wurzel = b1;
        b1.links = b2;
        b1.rechts = a;
        b2.links = a;
        b2.rechts = b3;
        b3.links = a;
        b3.rechts = a;
        System.out.println(test.preorder(test.wurzel));
        System.out.println(test.inorder(test.wurzel));
        System.out.println(test.postorder(test.wurzel));
    }
    
}
