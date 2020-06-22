/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kapitel_9_OOP_2.statische_methoden_und_membervariablen;

/**
 *
 * @author Niklas Fuchshofer
 */
class To_Do_Liste {
    String text;
    static int objcnt = 0;
    
    public To_Do_Liste(String text) {
        this.text = text;
        ++objcnt;
    }
   
    public void finalize() {
        --objcnt;
    }
}

public class Klassenvariablen_und_Konstanten {
    public static void main(String[] args) {
        To_Do_Liste aufgabe_1;
        To_Do_Liste aufgabe_2 = new To_Do_Liste("GGP");
        To_Do_Liste aufgabe_3 = new To_Do_Liste("AIIT");
        To_Do_Liste aufgabe_4 = new To_Do_Liste("EDT");
        aufgabe_3 = null;
        
        System.out.println("Anzahl der noch ausständigen Aufgaben: " +To_Do_Liste.objcnt);
    }
}

class Auto {
    private static final double STEUERSATZT = 18.9; // static + final == unveränderliche Variable mit unbegrenzter Lebensdauer
}