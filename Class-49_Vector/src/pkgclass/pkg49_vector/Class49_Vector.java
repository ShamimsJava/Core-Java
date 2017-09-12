/*
 * Vector constructor have four kind of overloading.
 * 1. Vector()
 * 2. Vector(Collection c)
 * 3. Vector(int initialCapacity)
 * 4. Vector(int initialCapacity capacityIncrement)
 */
package pkgclass.pkg49_vector;

import java.util.Enumeration;
import java.util.Vector;

public class Class49_Vector {

    public static void main(String[] args) {
        
        //initial size 3, inctrement is 2.
        Vector v = new Vector(3, 2);
        System.out.println("Initial Size: "+v.size());
        System.out.println("Initial Capasity: "+v.capacity());
        //add element
        v.addElement(new Integer(1));
        v.addElement(new Integer(2));
        v.addElement(new Integer(3));
        //v.addElement(new Integer(3)); //after cross 3 it increment 2.
        System.out.println("Capacity after addition: " +v.capacity());
        
        v.addElement(new Double(5.45));
        System.out.println("Current Capacity: " +v.capacity());
        v.addElement(new Double(6.45));
        v.addElement(new Integer(7));
        System.out.println("Current Capacity: " +v.capacity());
        
        v.addElement(new Integer(11));
        v.addElement(new Integer(12));
        
        //get vector element
        System.out.println("\nFirst Element: "+(Integer)v.firstElement());;
        System.out.println("Last Element: "+(Integer)v.lastElement());
        
        //Check an element in a vector
        if(v.contains(new Integer(7))){
            System.out.println("Vector contains 7.");
        }
        
        //Enumerate the elements in the vector.
        Enumeration enumeration = v.elements();
        System.out.println("\nElements in vector:");
        //hasMoreElements() method return true when there have an element in the vector
        while(enumeration.hasMoreElements()){
            //nextElement() method is for get vector element
            System.out.print(enumeration.nextElement()+" ");
        }
        System.out.println();
    }

}
