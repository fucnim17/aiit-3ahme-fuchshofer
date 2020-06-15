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
public abstract class Component {
    String id;
    private double value;
    double voltage;
    double current;


    public Component (String id, double value, double voltage, double current) {
        this.id = id;
        this.value = value;
        this.voltage = voltage;
        this.current = current;
        
        if(value < 0 || voltage < 0 || current < 0) {
            throw new IllegalArgumentException();
        }
    }

    public String getId () {
        return id;
    }

    public double getValue () {
        return value;
    }

    public double getVoltage () {
        return voltage;
    }

    public double getCurrent () {
        return current;
    }

    public void setVoltage (double voltage) {
        this.voltage = voltage;
    }

    public void setCurrent (double current) {
        this.current = current;
    }
    
    public double power () {
        return this.current * this.voltage;
    }
    
    public String formattedValue () {
        return toString();
    }
    
    @Override
    public String toString () {
        return "Component{" + "id=" + id + ", value=" + value + ", voltage=" + voltage + ", current=" + current + '}';
    }
    
    public abstract String unit();
    
    public abstract double energy();
   
    
}
