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
public class String_Verkettung {
    public static void main(String[] args) {
        int a = 5;
        double b = 3.14;
        
        System.out.println(+a+ " + " +b+ " = " +(a + b));
        
        /*
        Falsch: (Ergebniss wäre nicht 8.14, sondern 53.14)
        System.out.println(+a+ " + " +b+ " = " +a+b);
        */
    } 
    
}
