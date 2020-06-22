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

    public Resistor (double value) {
        super("R?", value);
    }

    public Resistor (String id, double value) {
        super(id, value);
        
        if(id.startsWith("R")) {
            throw new IllegalArgumentException("Invalid ID");
        }
    }

    public void setVoltage () {
        setVoltage(getCurrent() * getValue());
    }

    public void setCurrent () {
        setCurrent(getVoltage() / getValue());
    }
    
    @Override
    public String unit () {
        return "\\U+2126";
    }
    
    @Override
    public double energy () {
        return 0;
    }

} 
