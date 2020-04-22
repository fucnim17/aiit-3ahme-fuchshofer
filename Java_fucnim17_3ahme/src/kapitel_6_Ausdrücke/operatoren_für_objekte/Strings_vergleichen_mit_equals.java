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
public class Strings_vergleichen_mit_equals {
    public static void main(String[] args) {
        String a;
        String b;
        String c;
        
        a = "Coronavirus";
        b = "Coronavirus";
        c = "Influenzavirus";
        
        System.out.println("String a = " + a);
        System.out.println("String b = " + b);
        System.out.println("String c = " + c);
        System.out.println("");
        System.out.println("a.equals(b) liefert folgendes: " + a.equals(b));
        System.out.println("a.equals(c) liefert folgendes: " + a.equals(c));
        
        /*
        Mit equals wird der Inhalt von Strings verglichen
        */
    }
    
}
