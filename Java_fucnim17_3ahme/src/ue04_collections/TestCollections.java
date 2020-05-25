/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ue04_collections;

import java.util.ArrayList;

/**
 *
 * @author Niklas Fuchshofer
 */
public class TestCollections<E> {
    
    private E value;

    public TestCollections(E value) {
        this.value = value;
    }
    
    public TestCollections() {
        Double x1 = 3.14;
        double x2 = 3.14;  
        System.out.println("1: x1 == x2 => " + (x1 == x2));
        System.out.println("2: x1.equals(x2) => " + (x1.equals(x2)));
        
        String s1 = "Hallo";
        String s2 = new String ("Hallo");
        System.out.println("1: s1 == s2 => " + (s1 == s2));
        System.out.println("2: s1.equals(s2) => " + (s1.equals(s2)));
        
        ArrayList l1 = new ArrayList();
        System.out.println("1: l1.size() => " + l1.size());
        l1.add(x1);
        l1.add(x2);
        l1.add(s1);
        System.out.println("2: l1.size() => " + l1.size());
        System.out.println("3: " + l1);
        l1.remove(1);
        System.out.println("4: " + l1);
        
        ArrayList l2 = (ArrayList)l1.clone();
        System.out.println("5: " + l2);
        
        System.out.println("6: l1 == l2 => " + (l1 == l2));
        System.out.println("7: " + l1.hashCode() + " " + l2.hashCode());
        System.out.println("8: " + System.identityHashCode(l1) + " " + System.identityHashCode(l2));
        
        ArrayList<Double> l3 = new ArrayList<>();
        l3.add(5.0);
        l3.add(x2);
        l3.add(x1);
    }
    
    public static void main(String[] args) {
        new TestCollections<Double>(1.6);
        new TestCollections<String>("Hallo");
    }
}
