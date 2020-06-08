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
public abstract class Koerper {
    private double dichte;
    public static final double DICHTE_EICHE = 670;
    public static final double DICHTE_BUCHE = 690;

    public Koerper(double dichte) {
        this.dichte = dichte;
    }

    public double getDichte() {
        return dichte;
    }

    public void setDichte(double dichte) {
        this.dichte = dichte;
    }
    
    public abstract double oberfläche();
    
    public abstract double volumen();
    
    public double masse() {
        return volumen()*dichte;
    }
}
