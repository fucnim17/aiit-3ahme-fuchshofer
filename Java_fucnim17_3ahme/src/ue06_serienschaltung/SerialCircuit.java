/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ue06_serienschaltung;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 *
 * @author Niklas Fuchshofer
 */
public class SerialCircuit extends Component {
    private final List<Component> components = new ArrayList<>();
    private double current;

    public SerialCircuit() {
    }

    public SerialCircuit(Collection<Component> components) {
        this.components.addAll(components);
        setCurrent(0.0);    
    }

    public boolean add(Component c) {
        return components.add(c);
    }

    @Override
    public double getCurrent() {
        return current;
    }

    @Override
    public void setCurrent(double current) {
        this.current = current;
    }
    
    public double totalVoltage() {
        return getVoltage();
    }
    
    public double totalPower() {
        return power();
    }
    
    public double totalEnergy() {
        return energy();
    }

    
    
    
    
    public Object[] toArray() {
        return components.toArray();
    }

    @Override
    public String toString() {
        return "SerialCircuit{" + "components=" + components + '}';
    }

    
    
    

    @Override
    public String unit() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public double energy() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
 
    
    
}
