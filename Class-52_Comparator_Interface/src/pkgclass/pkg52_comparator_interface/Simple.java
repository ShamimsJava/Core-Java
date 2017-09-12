/*
 * Comparator interface is used to order the objects of used-defined slass.
 * This interface is found in java.util pacage and contains only
 *      one method named compare(Object obj1, Object obj2).
 * It provides multipl sorting sequence i.e
 *      you can sort the elements based on any data number.
 * For instance it may be of rollno, name, age or anything else.
 */

package pkgclass.pkg52_comparator_interface;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

/**
 *
 * @author HP PC
 */
public class Simple {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList a1 = new ArrayList();
        a1.add(new Student(101, "Ruhul", 27));
        a1.add(new Student(102, "Shakil", 23));
        a1.add(new Student(103, "Sadman", 24));
        a1.add(new Student(104, "Mintu", 25));
        
        System.out.println("========Sorting by name========");
        
        Collections.sort(a1, new NameComperator());
        Iterator itr = a1.iterator();
        while (itr.hasNext()) {
            Student st = (Student) itr.next();
            System.out.println(st.rollno + " "+st.name + " "+ st.age);
        }
        
        System.out.println("========Sorting by Age========");
        
        Collections.sort(a1, new AgeComparator());
        Iterator itr2 = a1.iterator();
        while (itr2.hasNext()) {
            Student st = (Student) itr2.next();
            System.out.println(st.rollno + " "+st.name + " "+ st.age);
        }
    }
    
}
