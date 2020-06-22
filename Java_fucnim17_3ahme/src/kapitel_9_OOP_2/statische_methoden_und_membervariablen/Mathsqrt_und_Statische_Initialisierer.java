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
public class Mathsqrt_und_Statische_Initialisierer {
    public static void main(String[] args) {
        double a, b;
        for(a = 0.0; a <= 10; ++a) {
            b = Math.sqrt(a);
            System.out.println("sqrt("+a+") = "+b);
        }
    }
}

class Test {
    static int i;
    static int j;
    
    static {
        i = 5;
        j = 3 * i;
    }
}