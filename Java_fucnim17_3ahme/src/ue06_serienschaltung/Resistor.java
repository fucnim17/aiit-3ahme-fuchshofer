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
public class Resistor extends Component {
    public double value;

    public Resistor (double value) {
        super(id, 0.0, voltage, current);
        this.value = value;
        this.id = "R?";
    }

    public Resistor (String id, double value, double voltage, double current) {
        super(id, value, voltage, current);
        this.value = value;
    }

    @Override
    public void setVoltage (double voltage) {
        this.current = current;
        this.voltage = this.current * this.value;
    }

    @Override
    public void setCurrent (double current) {
        this.voltage = voltage;
        this.current = this.voltage / this.value;
    }
    
    @Override
    public String unit () {
        return "\\U+2126";
    }
    
    public double energy () {
        return 0;
    }

} 
