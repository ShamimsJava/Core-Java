package pkgclass.pkg56_upper_bound_wildcard;

import java.util.ArrayList;
import java.util.List;

public class Class56_Upper_Bound_Wildcard {
//  Upper bound 
// List<? extends Number> means a list of objects that are instance
//  of the class Number, or subclasses of Number (e.g Integer or Double)
    
//List<? extends type> means that
//  (?) unknown type extends a fixed type.
    
    //Example of upper bound
    public static double sum(List<? extends Number> list){
        double sum = 0.0;
        for (Number number : list) {
            sum += number.doubleValue();
        }
        return sum;
    }
    
    public static void main(String[] args) {
        List<Integer> intList = new ArrayList<>();
        intList.add(new Integer(3));
        intList.add(new Integer(5));
        intList.add(new Integer(10));
        
        double sum = sum(intList);
        System.out.println("Sum of intList = "+sum);
    }
    
}
