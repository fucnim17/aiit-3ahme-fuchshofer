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
class Computerspiel{
    public String name;
    public int erscheinungsjahr;
    
    public int alter() {
        return 2020 - this.erscheinungsjahr;
    }
    
    public void printAlter(int anzahl) {
        while (anzahl > 0) {
            System.out.println("Alter: " +alter());
            --anzahl;
        }
    }
}
public class Methoden {
    public static void printString(String[] ausgabe) {
        for(int i = 0; i < ausgabe.length; ++i) {
            System.out.println(ausgabe[i]);
        }
    }
    public static void main(String[] args) {
        Computerspiel rainbowSixSiege = new Computerspiel();
        rainbowSixSiege.name = "Rainbow Six Siege";
        rainbowSixSiege.erscheinungsjahr = 2015;
        
        Computerspiel minecraft = new Computerspiel();
        minecraft.name = "Minecraft";
        minecraft.erscheinungsjahr = 2009;
        
        System.out.println(rainbowSixSiege.name+ " gibt es schon seit " +rainbowSixSiege.alter()+ " Jahren.");
        
        rainbowSixSiege.printAlter(3);
        
        String[] name = {rainbowSixSiege.name, minecraft.name};
        printString(name);
    }
    
}
