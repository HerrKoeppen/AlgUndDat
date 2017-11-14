/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graph;

/**
 *
 * @author K
 */
public class TestTiefensuche {

    public static void main(String[] args) {
        Knoten k0 = new Knoten(0);
        Knoten k1 = new Knoten(1);
        Knoten k2 = new Knoten(2);
        Knoten k3 = new Knoten(3);
        Knoten k4 = new Knoten(4);
        Knoten k5 = new Knoten(5);
        Knoten k6 = new Knoten(6);

        Graph g = new Graph(7);

        g.knotenEinfuegen(k0);
        g.knotenEinfuegen(k1);
        g.knotenEinfuegen(k2);
        g.knotenEinfuegen(k3);
        g.knotenEinfuegen(k4);
        g.knotenEinfuegen(k5);
        g.knotenEinfuegen(k6);

        g.kanteEinfuegen(0, 1);
        g.kanteEinfuegen(0, 2);
        g.kanteEinfuegen(1, 3);
        g.kanteEinfuegen(2, 3);
        g.kanteEinfuegen(3, 4);
        g.kanteEinfuegen(4, 5);
        g.kanteEinfuegen(4, 6);

        g.adjazenzmatrixAusgeben();

        System.out.println("Tiefensuche beginnend beim Knoten mit dem index 0:");
        g.tiefensuche(0);
        System.out.println();
        System.out.println();

        System.out.println("Tiefensuche beginnend beim Knoten mit dem index 3:");
        g.tiefensuche(3);

    }
}
