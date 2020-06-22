/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kapitel_9_OOP_2.vererbung;

/**
 *
 * @author ROG
 */
class Auto {
    public String name;
    public double leistung;
    public int erstzulassung;
    
    public void print(String name, double leistung, int erstzulassung) {
    System.out.println(name+ ", " +leistung+ " PS, " +erstzulassung);
    }
    
    @Override
    public String toString(){
        return String.format("%s, Baujahr %d, hat eine Leistung von %.2f PS", name, erstzulassung, leistung);
        
    }
}

class Cabrio extends Auto {
    public int vdauer; //die Zeit, die zum Öffnen des Verdecks benötigt wird
    
    public Cabrio(int vdauer) {
        this.vdauer = vdauer;
    }

    public void print(String name, double leistung, int erstzulassung, int vdauer) {
    System.out.println(name+ ", " +leistung+ " PS, " +erstzulassung+ ", " +vdauer+ " sek");
    }
}

public class Ableiten_einer_Klasse {
    public static void main(String[] args) {
        Auto auto = new Auto();
        auto.name = "VW Passat";
        auto.leistung = 140;
        auto.erstzulassung = 2012;
        
        Cabrio wochenendsauto = new Cabrio(60);
        wochenendsauto.name = "MX5";
        wochenendsauto.leistung = 94;
        wochenendsauto.erstzulassung = 1996;
        
        auto.print(auto.name, auto.leistung, auto.erstzulassung);
        wochenendsauto.print(wochenendsauto.name, wochenendsauto.leistung, wochenendsauto.erstzulassung, wochenendsauto.vdauer);
        System.out.println(auto.toString());
        System.out.println(wochenendsauto.toString());
    }
   
}
