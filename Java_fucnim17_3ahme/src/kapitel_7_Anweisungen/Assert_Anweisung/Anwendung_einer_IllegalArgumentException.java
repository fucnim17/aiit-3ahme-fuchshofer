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
public class Anwendung_einer_IllegalArgumentException {
    public static void main(String[] args) {
        int[] a = {8, 5, 3};
        if(a.length < 2) {
            throw new IllegalArgumentException();
        }
        
    }
    
}
