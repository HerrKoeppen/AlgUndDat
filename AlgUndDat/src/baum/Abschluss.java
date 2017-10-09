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
class Abschluss extends Baumelement {
    
    public void mutterSetzen(Baumelement nl) {
        System.out.println("Ein Abschluss hat keine Mutter!");
    }
    public void vaterSetzen(Baumelement nr) {
        System.out.println("Ein Abschluss hat keinen Vater!");
    }
    public Baumelement mutterGeben() {
        System.out.println("Mutter nicht bekannt!");
        return this;
    }
    public Baumelement vaterGeben() {
        System.out.println("Vater nicht bekannt!");
        return this;
    }
    public Datenelement inhaltGeben(){
      return null;
    }
    public int anzahlDatenknotenGeben(){
      return 0;
    }
    public void baumdatenAusgeben(){
    }
 }
