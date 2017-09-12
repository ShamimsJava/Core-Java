
package pkgclass.pkg55_unbounded_wildcard_2;

import java.util.ArrayList;
import java.util.List;

public class Class55_Unbounded_Wildcard_2 {
    /*
    * Unbounded Wildcard
    * When we use a ? in generics then it called unbounded wildcard.
    * List<?> means a list type to an unknown type.
    * Its same as using <? extends Object>.
    */
    
    public static void processElement(List<?> elements){
        // Type of List<?> is unknown. We can pass any type of data.
        for(Object o : elements){
            System.out.println(o);
        }
    }

    public static void main(String[] args) {
        List<Integer> ints = new ArrayList<>();
        ints.add(new Integer(3));
        ints.add(new Integer(5));
        ints.add(new Integer(10));
        processElement(ints);
        
        System.out.println(" ");
        
        List<Double> dts = new ArrayList<>();
        dts.add(new Double(3.3));
        dts.add(new Double(3.5));
        dts.add(new Double(10.2));
        processElement(dts);
       
    }
    
}
