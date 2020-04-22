/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ue01_Taschenrechner;

import java.util.Scanner;

/**
 *
 * @author Niklas Fuchshofer
 */
public class TestTaschenrechnerFormatiert {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        System.out.print("Wert a: ");
        final double a = s.nextDouble();
        System.out.print("Wert b: ");
        final double b = s.nextDouble();
        
        Taschenrechner test = new Taschenrechner(a, b);   
        
        System.out.format("Addition: %.3f\n", test.getAdditionResult());
        System.out.format("Subtraktion: %.3f\n", test.getSubtractionResult());
        System.out.format("Multiplikation: %.3f\n", test.getMultiplicationResult());
        System.out.format("Division: %.3f\n", test.getDivisionResult());
    }   
}
