/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ue02_serienschaltung;

import java.util.ArrayList;

/**
 *
 * @author Niklas Fuchshofer
 */
public class SerienschaltungV2 {
    private double strom;
    private double spannung;
    ArrayList<Double> widerstandsListe = new ArrayList();

    private void updateSpannung() {
        spannung = 0;
        if(widerstandsListe.isEmpty()) {
            return;
        } 
        
        for(int i = 0; i < widerstandsListe.size(); ++i) {
            spannung += strom * widerstandsListe.get(i);
        }
    }
    
    public void addWiderstand(double widerstandInOhm) throws InvalidResistorValueException {
        if(widerstandInOhm < 0 || widerstandInOhm > 10E6) {
            throw new InvalidResistorValueException(widerstandInOhm);
        }
        widerstandsListe.add(widerstandInOhm);
        updateSpannung();   
    }
    
    public double getStrom() {
        return strom;
    }
    
    public void setStrom(double strom) {
        this.strom = strom;
        updateSpannung();
    }
    
    public double getSpannung() {
        return spannung;
    }

    @Override
    public String toString() {
        return "Serienschaltung{" + "strom=" + strom + ", spannung=" + spannung + ", widerstandsListe=" + widerstandsListe + '}';
    }
}
