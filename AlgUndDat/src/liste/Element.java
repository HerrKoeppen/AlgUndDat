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
public class Element {

    String bezeichner;

    public Element(String bez) {
        bezeichner = bez;
    }

    public String datenwertGeben() {
        return bezeichner;
    }
}
