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
    
    public Coil (double value) {
        super("L?", value);
    }
    
    public Coil (String id, double value) {
        super(id, value);
        
        /*if(!id.startsWith("L")) {
            throw new IllegalArgumentException("Invalid ID");
        }*/
    }
    
    @Override
    public String unit () {
        return "H";
    }

    @Override
    public double energy () {
        return getValue() * getCurrent() * getCurrent() / 2;
    }
}
