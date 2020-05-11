/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ue02_serienschaltung;

/**
 *
 * @author Niklas Fuchshofer
 */
public class TestSerienschaltung {
    public static void main (String[] args) {
    final Serienschaltung serienschaltung = new Serienschaltung();
    
    System.out.println("1: " + serienschaltung);
    try {
        serienschaltung.addWiderstand(-10);
    } catch (InvalidResistorValueException ex) {
        System.out.println("Fehler aufgetreten bei " + ex.getInvalidValue());
        ex.printStackTrace(System.out);
        
        throw new TestFailedException(ex);
    }
 
    System.out.println("2: " + serienschaltung);
    serienschaltung.setStrom(0.5);
    
    System.out.println("3: " + serienschaltung);
    try {
        serienschaltung.addWiderstand(10);
    } catch (InvalidResistorValueException ex) {
        System.out.println("Fehler aufgetreten bei " + ex.getInvalidValue());
        ex.printStackTrace(System.out);
    }
        
    System.out.println("4: " + serienschaltung);
    try {
        serienschaltung.addWiderstand(20);
    } catch (InvalidResistorValueException ex) {
        System.out.println("Fehler aufgetreten bei " + ex.getInvalidValue());
        ex.printStackTrace(System.out);

    }
    System.out.println("5: " + serienschaltung);
    serienschaltung.setStrom(1);
    
    System.out.println("6: " + serienschaltung);
    }
    
    public static class TestFailedException extends RuntimeException {

        public TestFailedException(Throwable cause) {
            super(cause);
        }
        
    }
}