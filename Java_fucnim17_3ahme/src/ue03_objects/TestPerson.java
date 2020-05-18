/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ue03_objects;

/**
 *
 * @author Niklas Fuchshfoer
 */
public class TestPerson {

    public TestPerson() {
        Person p1 = new Person("Niklas", "Fuchshofer");
        Person p2 = new Person("Andreas", "Kogler");
        //Person p3 = p1;
        Person p3 = p1.clone();
            
        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);
        
        System.out.println(p1 == p3);
        System.out.println(p1.equals(p3));
        
        System.out.println(p1.hashCode());
        System.out.println(p3.hashCode());
    }
    
   
    public static void main(String[] args) {
        new TestPerson();

    }
}
