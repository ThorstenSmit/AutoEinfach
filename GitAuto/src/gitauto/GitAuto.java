/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gitauto;

/**
 *
 * @author Anwender
 */
public class GitAuto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Autoreifen reifenArray[] = {new Autoreifen(), new Autoreifen(), new Autoreifen(), new Autoreifen()};
        reifenArray[0].setPreis(100);
        reifenArray[1].setPreis(110);
        reifenArray[2].setPreis(120);
        reifenArray[3].setPreis(130);
        reifenArray[0].setGroesse("15");
        reifenArray[1].setGroesse("16");
        reifenArray[2].setGroesse("17");
        reifenArray[3].setGroesse("18");
        Auto auto1 = new Auto(reifenArray);
        System.out.println("Der Gesamtpreis der Reifen beträgt: " + auto1.getGesamtpreisReifen());
        
    }
    
}
