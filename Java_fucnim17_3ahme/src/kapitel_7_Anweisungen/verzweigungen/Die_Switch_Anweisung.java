/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kapitel_7_Anweisungen.verzweigungen;

/**
 *
 * @author Niklas Fuchshofer
 */
public class Die_Switch_Anweisung {
    public static void main(String[] args) {
        int auswahl = 2;
        
        switch (auswahl) {
            case 1: System.out.println("Auswahl = 1"); break;
            case 2: System.out.println("Auswahl = 2"); break;
            case 3: System.out.println("Auswahl = 3"); break;
            default: System.out.println("Ungültige Zahl eingegeben");
        }
    }
    
}
