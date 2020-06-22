/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kapitel_7_Anweisungen.schleifen;

/**
 *
 * @author Niklas Fuchshofer
 */
public class While_Schleife {
    public static void main(String[] args) {
        double z = 0.98;
        int i = 1;
        
        while(z < 9) {
            System.out.println("-> " + i);
            ++ i;
            z += z;
        }
    }
    
}
