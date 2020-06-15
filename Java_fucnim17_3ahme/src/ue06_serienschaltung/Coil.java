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
public class Coil extends Component {
    public double value;
    
    public Coil (double value) {
        super(id, 0.0, voltage, current);
        this.value = value;
        this.id = "L?";
    }
    
    public Coil (String id, double value, double voltage, double current) {
        super(id, value, voltage, current);
        this.value = value;
    }
    
    @Override
    public String unit () {
        return "H";
    }

    @Override
    public double energy () {
        return this.value*this.current*this.current/2;
    }
}
