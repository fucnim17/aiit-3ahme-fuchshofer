/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ue01_Taschenrechner;

import java.util.Scanner;

/**
 *
 * @author Niklas Fuchshfoer
 */
public class TestTaschenrechner {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        System.out.print("Wert a: ");
        final double a = s.nextDouble();
        System.out.print("Wert b: ");
        final double b = s.nextDouble();
        
        Taschenrechner test = new Taschenrechner(a, b);   
        
        System.out.println("Addition: " +test.getAdditionResult());
        System.out.println("Subtraktion: " +test.getSubtractionResult());
        System.out.println("Multiplikation: " +test.getMultiplicationResult());
        System.out.println("Division: " +test.getDivisionResult());
    }   
}
