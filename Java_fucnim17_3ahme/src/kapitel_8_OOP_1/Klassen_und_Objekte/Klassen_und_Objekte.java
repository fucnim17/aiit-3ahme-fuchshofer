/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kapitel_8_OOP_1.Klassen_und_Objekte;

/**
 *
 * @author Niklas Fuchshofer
 */
class Motorrad {
    public String hersteller;
    public String name;
    public double hubraum;
    public double leistung;
    public int erstzulassung;  
}

public class Klassen_und_Objekte {
    public static void main(String[] args) {   
        Motorrad meinMotorrad =  new Motorrad();
        meinMotorrad.hersteller = "Kawasaki";
        meinMotorrad.name = "Z 125";
        meinMotorrad.hubraum = 125;
        meinMotorrad.leistung = 15;
        meinMotorrad.erstzulassung = 2019;
        
        Motorrad mikesMotorrad = new Motorrad();
        mikesMotorrad.hersteller = "Beta";
        mikesMotorrad.name = "RR 125 LC";
        mikesMotorrad.hubraum = 125;
        mikesMotorrad.leistung = 15;
        mikesMotorrad.erstzulassung = 2019;
        
        Motorrad juliansMotorrad = new Motorrad();
        juliansMotorrad.hersteller = "KTM";
        juliansMotorrad.name = "Duke 125";
        juliansMotorrad.hubraum = 125;
        juliansMotorrad.leistung = 15;
        juliansMotorrad.erstzulassung = 2016;
        
        String[] hersteller = {meinMotorrad.hersteller,
            mikesMotorrad.hersteller, juliansMotorrad.hersteller};
        
        String[] name = {meinMotorrad.name,
            mikesMotorrad.name, juliansMotorrad.name};
        
        double[] hubraum = {meinMotorrad.hubraum,
            mikesMotorrad.hubraum, juliansMotorrad.hubraum};
        
        double[] leistung = {meinMotorrad.leistung,
            mikesMotorrad.leistung, juliansMotorrad.leistung};
        
        int[] erstzulassung = {meinMotorrad.erstzulassung,
            mikesMotorrad.erstzulassung, juliansMotorrad.erstzulassung};
        
        System.out.println("-----------------------------------------------");
        for(int i = 0; i < name.length; ++i) {
            System.out.format("%-10s | %-10s | %-5.2f | %-5.2f | %-5d",
                    hersteller[i], name[i], hubraum[i], leistung[i], erstzulassung[i]);
            System.out.println("");
        }
        System.out.println("-----------------------------------------------");
    }
    
}

