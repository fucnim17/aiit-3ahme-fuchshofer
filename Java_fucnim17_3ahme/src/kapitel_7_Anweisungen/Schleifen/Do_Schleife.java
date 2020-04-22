/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kapitel_7_Anweisungen.Schleifen;

/**
 *
 * @author Niklas Fuchshofer
 */
public class Do_Schleife {
    public static void main(String[] args) {
        double eingabe;
        do {
            System.out.println("Eingabe erfolgt....");
            eingabe = 3.64;
        } while (eingabe < 2 || eingabe > 5);
    }
    
}
