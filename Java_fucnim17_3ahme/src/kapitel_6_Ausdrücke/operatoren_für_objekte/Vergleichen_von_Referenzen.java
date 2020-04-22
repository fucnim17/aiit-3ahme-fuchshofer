/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kapitel_6_Ausdrücke.operatoren_für_objekte;

/**
 *
 * @author Niklas Fuchshofer
 */
public class Vergleichen_von_Referenzen {
    public static void main(String[] args) {
        String a = "Coronavirus";
        String b = "Coronavirus";
        
        System.out.println("a == b liefert folgendes: " + (a == b));
        System.out.println("a != b liefert folgendes: " + (a != b));
        
        /*
        Man erwartet im ersten Moment das Gegenteil,
        doch die Referenzoperatoren == und != vergleichen nur die Zeiger
        und nicht die Inhalte der Objekte
        */
    }
    
}
