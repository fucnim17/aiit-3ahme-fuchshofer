/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ue02_serienschaltung;

import java.util.Scanner;

/**
 *
 * @author Niklas Fuchshofer
 */
public class SerienschaltungRechner {
    public static void main(String[] args) {
        final Serienschaltung serienschaltung = new Serienschaltung();
        Scanner sc = new Scanner(System.in);
        
        while(true) {
            try {
                System.out.print("Please enter the current: ");
                final double strom = new Scanner(System.in).nextDouble();
                serienschaltung.setStrom(strom);
                break;
            } catch (java.util.InputMismatchException ex) {
            
            }
        }
            
        try {
            while(true) {
                System.out.print("Please enter a resistor: ");
                final double widerstand = sc.nextDouble();
                serienschaltung.addWiderstand(widerstand);  
            }   
        } catch(InvalidResistorValueException ex) {
            System.out.println("Spannung: " + serienschaltung.getSpannung());
        }
    }
}
