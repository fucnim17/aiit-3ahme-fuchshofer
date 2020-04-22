/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ue01_Taschenrechner;

/**
 *
 * @author Niklas Fuchshofer
 */
public class Taschenrechner {
    public double a;
    public double b;
    
    public Taschenrechner(double a, double b) {
        this.a = a;
        this.b = b;
    }
    
    public double getAdditionResult() {
        return a + b;
    }
    
    public double getSubtractionResult() {
        return a - b;
    }
    
    public double getMultiplicationResult() {
        return a * b;
    }
    
    public double getDivisionResult() {
        return a / b;
    }
}
