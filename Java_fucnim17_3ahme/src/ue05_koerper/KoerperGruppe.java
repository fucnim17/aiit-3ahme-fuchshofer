/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ue05_koerper;

import java.util.ArrayList;

/**
 *
 * @author Niklas Fuchshofer
 */
public class KoerperGruppe extends Koerper{
    private ArrayList<Koerper> koerperListe = new ArrayList<>();
    private double dichte;

    public KoerperGruppe(ArrayList koerperListe, double dichte) {
        this.koerperListe = koerperListe;
        this.dichte = dichte;
    }
    
    
    
}
