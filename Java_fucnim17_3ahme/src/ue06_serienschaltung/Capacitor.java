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
    public double value;
    
    public Capacitor (double value) {
        super(id, 0.0, voltage, current);
        this.value = value;
        this.id = "C?";
    }
    
    public Capacitor (String id, double value, double voltage, double current) {
        super(id, value, voltage, current);
        this.value = value;
    }
    
    @Override
    public String unit () {
        return "F";
    }
    
    @Override
    public double energy () {
        return this.value*this.voltage*this.voltage/2;
    }
}
