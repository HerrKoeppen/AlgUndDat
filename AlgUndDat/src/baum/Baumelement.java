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
abstract class Baumelement {
    public abstract void mutterSetzen(Baumelement nl);
    public abstract void vaterSetzen(Baumelement nr);
    public abstract Baumelement mutterGeben();
    public abstract Baumelement vaterGeben();
    public abstract Datenelement inhaltGeben();
    public abstract int anzahlDatenknotenGeben();
    public abstract void baumdatenAusgeben();
    public abstract void baumdatenAusgebenPre();
    public abstract void baumdatenAusgebenPost();
}
