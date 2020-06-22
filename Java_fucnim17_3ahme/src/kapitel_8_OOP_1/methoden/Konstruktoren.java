/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kapitel_8_OOP_1.methoden;

/**
 *
 * @author Niklas Fuchshofer
 */
class Auto {
    public String name;
    public double leistung;
    public int erstzulassung;
    
    public Auto(String name, double leistung, int erstzulassung) {
        this.name = name;
        this.leistung = leistung;
        this.erstzulassung = erstzulassung;
    }
}
public class Konstruktoren {
    public static void main(String[] args) {
        Auto meinAuto = new Auto("VW Passat", 140, 2012);
        System.out.println(meinAuto.name+ ", " +meinAuto.leistung+ " PS, " +meinAuto.erstzulassung);
    }
}
