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
public class Erweiterte_For_Schleife {
    public static void main(String[] args) {
        int[] a = new int [10];
        for(int i = 0; i < a.length; ++i) {
            a[i] = i;
        }
        
        //Ausgabe aller Elemente des Arrays über den Index
        for(int i = 0; i < a.length; ++i) {
            System.out.println(a[i]);
        }
        
        System.out.println("-");
        
        //Ausgabe aller Elemente des Arrays über die erweiterte for-Schleife (foreach-Schleife)
        for(int i : a) {
            System.out.println(i);
        }
    }
    
}
