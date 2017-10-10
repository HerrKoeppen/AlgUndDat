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
public class Testablauf {
    Ahnenbaum abaum=new Ahnenbaum();
    Person[] person=new Person[16];
    Datenknoten[] datenknoten=new Datenknoten[16];
   
    public void ablaufen(){
        person[0]=new Person("Händel","Georg,Friedrich","1685","1759","Komponist");
                
        person[1]=new Person("Taust","Dorothea","1651","1730","");
        person[2]=new Person("Händel","Georg","1622","1697","Amtschirurg");
        
        person[3]=new Person("Cuno","Dorothea","1618","1682","");
        person[4]=new Person("Taust","Georg","1606","1685","Pfarrer");
        person[5]=new Person("Beichling","Anna","1587","1670","");
        person[6]=new Person("Händel","Valentin","1582","1636","Kupferschmied");
                
        person[7]=new Person("Olearius","Catharina","1595","1672","");
        person[8]=new Person("Cuno","Christoph","1590","?","Gerichtsschr.");
        person[9]=new Person("Taust","Joh.","?","?","Prediger");
        person[10]=new Person("Beichling","Samuel","?","?","Kupferschmied");
        person[11]=new Person("Händel","Valentin","?","?","Röhrmeister?");
        
        person[12]=new Person("Heshusius","Anna","1566","1600","");
        person[13]=new Person("Olearius","Johannes","1546","1623","Prof. theol.");
        person[14]=new Person("Becker","Dorothea","?","1631","");
        person[15]=new Person("Cuno","Samuel","um 1555","1615","Hospitalprediger");
        
        for (int i=0;i<16;i++){
            datenknoten[i]=new Datenknoten(new Abschluss(),new Abschluss(),person[i]);
        }
        abaum.wurzelSetzen(datenknoten[0]);
                
        datenknoten[0].mutterSetzen(datenknoten[1]);
        datenknoten[0].vaterSetzen(datenknoten[2]);
                
        datenknoten[1].mutterSetzen(datenknoten[3]);
        datenknoten[1].vaterSetzen(datenknoten[4]);
                
        datenknoten[2].mutterSetzen(datenknoten[5]);
        datenknoten[2].vaterSetzen(datenknoten[6]);
                
        datenknoten[3].mutterSetzen(datenknoten[7]);
        datenknoten[3].vaterSetzen(datenknoten[8]);
                
        datenknoten[4].vaterSetzen(datenknoten[9]);
                
        datenknoten[6].vaterSetzen(datenknoten[10]);
                 
        datenknoten[7].vaterSetzen(datenknoten[11]);
                
        datenknoten[8].mutterSetzen(datenknoten[12]);
        datenknoten[8].vaterSetzen(datenknoten[13]);
                
        datenknoten[9].mutterSetzen(datenknoten[14]);
        datenknoten[9].vaterSetzen(datenknoten[15]);
        
        System.out.println("Anzahl: "+abaum.anzahlDatenknotenGeben());
        abaum.alleDatenAusgeben();System.out.println();
        
        
        System.out.println("Vater der Mutter der Mutter von Händel: ");
        abaum.wurzelGeben().mutterGeben().mutterGeben().vaterGeben().inhaltGeben().datenAusgeben();
        
        
    }
    public static void main(String[] args){
        Testablauf t = new Testablauf();
        t.ablaufen();
        }
}

