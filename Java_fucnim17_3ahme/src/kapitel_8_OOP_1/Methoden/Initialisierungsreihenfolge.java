/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kapitel_8_OOP_1.Methoden;

/**
 *
 * @author Niklas Fuchshofer
 */
class Schule {
    String schulname;
    
    public Schule() {
        Initialisierungsreihenfolge.getAndPrintString("Schule");
    }
}

class Klasse extends Schule {
    String klassenname;
    
    public Klasse() {
        Initialisierungsreihenfolge.getAndPrintString("Klasse");
    }
}
public class Initialisierungsreihenfolge {
    public static void getAndPrintString(String s) {
        System.out.println(s);
    }
    
    public static void main(String[] args) {
        Klasse meineKlasse = new Klasse();
        meineKlasse.schulname = "HTL Arnfels";
        meineKlasse.klassenname = "3AHME";
        System.out.println(meineKlasse.schulname+ ", " +meineKlasse.klassenname);
    }
}
