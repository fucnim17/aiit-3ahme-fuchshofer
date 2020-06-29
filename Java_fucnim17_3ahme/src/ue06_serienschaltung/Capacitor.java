/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ue06_serienschaltung;


/**
 *
 * @author Niklas Fuchshofer
 */
public class Capacitor extends Component {
    
    public Capacitor (double value) {
        super("C?", value);
    }
    
    public Capacitor (String id, double value) {
       super(id, value);
       
       /*if(id.startsWith("C")) {
           throw new IllegalArgumentException("Invalid ID");
       }*/
    }
    
    @Override
    public String unit () {
        return "F";
    }
    
    @Override
    public double energy () {
        return getValue() * getVoltage() * getVoltage() / 2;
    }
}
