/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kapitel_7_Anweisungen.Verzweigungen;

/**
 *
 * @author Niklas Fuchshofer
 */
public class Die_If_Anweisung {
    public static void main(String[] args) {
        double p = 3.142;
        double e = 2.718;
        
        String a = "Java";
        String b = "Java";
        
        if (p == e) {
            System.out.println("p == e -> true");
        } else {
            System.out.println("p == e -> false");
        }
        
        if (a.equals(b)) {
            System.out.println(a.equals(b));
        } else {
            System.out.println("false");
        }
    }
    
}
