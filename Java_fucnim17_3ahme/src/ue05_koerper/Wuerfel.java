/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ue05_koerper;

/**
 *
 * @author Niklas Fuchshofer
 */
public class Wuerfel extends Koerper{
    private double a;
    
    public Wuerfel(double a) {
    super(0.0);
    this.a = a;
    }

    public Wuerfel(double a, double dichte) {
        super(dichte);
        this.a = a;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    @Override
    public double oberfläche() {
        return a * a * 6;
    }

    @Override
    public double volumen() {
        return a * a * a;
    } 

    @Override
    public String toString() {
        return "Wuerfel{" + "a=" + a + '}';
    }
}
