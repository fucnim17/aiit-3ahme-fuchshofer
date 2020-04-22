/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kapitel_7_Anweisungen.Assert_Anweisung;

/**
 *
 * @author Niklas Fuchshofer
 */
public class Anwendung_von_Assertions {
    public static void main(String[] args) {
        int[] zahlen = {8, 2};
        
        /*
        WICHTIG: Unter File -> Project Properties -> Run -> VM Options
        -enableassertions eintragen!!!
        */
        
        //Überprüfung ob mindestens 2 Zahlen vorhanden sind
        assert zahlen.length >= 2 : "Es werden 2 Zahlen benötigt";
        
        int z1 = zahlen[0];
        int z2 = zahlen[1];
        
        //Überprüfung ob die zweite Zahl nciht Null ist
        assert z2 != 0 : "Teilen durch o nicht möglich";
        
        System.out.println(z1 + " / " + z2 + " = " + (z1 / z2));
    }
    
}
