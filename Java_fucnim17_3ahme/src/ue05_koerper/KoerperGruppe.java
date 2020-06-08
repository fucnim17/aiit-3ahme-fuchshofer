/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ue05_koerper;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 *
 * @author Niklas Fuchshofer
 */
public class KoerperGruppe{
    private final List<Koerper> koerperListe = new ArrayList<>();
    private double dichte;

    public KoerperGruppe() {
    }

    public KoerperGruppe (Collection<Koerper> koerperListe, double dichte) {
        this.koerperListe.addAll(koerperListe);
        setDichte(dichte);
    }

    public int size() {
        return koerperListe.size();
    }

    public boolean contains(Koerper k) {
        return koerperListe.contains(k);
    }

    public Object[] toArray() {
        return koerperListe.toArray();
    }

    public boolean add(Koerper k) {
        k.setDichte(dichte);
        return koerperListe.add(k);
    }

    public boolean remove(Koerper k) {
        return koerperListe.remove(k);
    }

    public double getDichte() {
        return dichte;
    }

    public final void setDichte(double dichte) {
        this.dichte = dichte;
        for(Koerper k : this.koerperListe) {
            k.setDichte(dichte);
        }
    }

    public List<Koerper> getKoerperListe() {
        return koerperListe;
    }
    
    public double gesamtMasse() {
        double rv = 0.0;
        for(Koerper k: this.koerperListe) {
            rv += k.masse();
        }
        return rv;
    }
    
    public double gesamtVolumen() {
        double rv = 0.0;
        for(Koerper k: this.koerperListe) {
            rv += k.volumen();
        }
        return rv;
    }

    @Override
    public String toString() {
        return "KoerperGruppe{" + "koerperListe=" + koerperListe + ", dichte=" + dichte + '}';
    }
    

}
