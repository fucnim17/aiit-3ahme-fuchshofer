/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ue05_koerper;

/**
 *
 * @author Niklas Fucshhfoer
 */
public class Kugel extends Koerper{
    private double r;

    public Kugel(double r, double dichte) {
        super(dichte);
        this.r = r;
    }

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }
   
    @Override
    public double oberfläche() {
        return 4 * Math.PI * r * r;
    }
    
    @Override
    public double volumen() {
        return (4/3) * Math.PI * r * r * r;
    }

    @Override
    public String toString() {
        return "Kugel{" + "r=" + r + '}';
    }
}
