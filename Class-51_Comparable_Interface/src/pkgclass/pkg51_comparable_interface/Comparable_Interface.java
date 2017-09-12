/*
* For sorting our collection objects we use two interface.
* (a) Comparable Interface.
* (b) Comparator Interface.
 */

package pkgclass.pkg51_comparable_interface;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

/**
 *
 * @author HP PC
 */
public class Comparable_Interface{ 

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Student> al = new ArrayList();
        al.add(new Student(101 , "Ruhul", 27));
        al.add(new Student(102 , "Borna", 28));
        al.add(new Student(103 , "Reza", 29));
        al.add(new Student(104 , "Goni", 26));
        
        Collections.sort(al);
        Iterator<Student> itr = al.iterator();
        while (itr.hasNext()) {
            Student st = itr.next();
            System.out.println(st.rollNo+" "+st.name+" "+
                    st.age);
        }
    }
    
}
