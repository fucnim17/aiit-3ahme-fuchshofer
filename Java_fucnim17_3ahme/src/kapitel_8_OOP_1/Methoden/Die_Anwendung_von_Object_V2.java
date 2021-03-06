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
public class Die_Anwendung_von_Object_V2 {
    public static double registrierKasse(Object... args) {
        double zwischensumme = 0;
        double gesamtsumme = 0;
        
        for(int i = 0; i < args.length; ++i) {
            if(args[i] instanceof Number) {
                zwischensumme += ((Number)args[i]).doubleValue();
            } else {
                System.out.println(args[i]+ ": " +zwischensumme);
                gesamtsumme += zwischensumme;
                zwischensumme = 0;
            }
        }
        return gesamtsumme;
    }
    public static void main(String[] args) {
        System.out.println("Gesamtsumme: "
            +registrierKasse(1.45, 0.79, 19.90, "Ware", -3.00, 1.50, "Pfand", -10, "Gutschein")
        );
    }
    
}