package pkgclass.pkg56_lower_bound_wildcard;

import java.util.ArrayList;
import java.util.List;

public class Class56_Lower_Bound_Wildcard {

    //Lower bound
    //List<? super Integer> means that the list is typed to either the
    //  Integer class, or a superclass of Integer such as Number.
    
    //Means that we pass such type that the super type of this 
    // type is Integer.
    public static void add(List<? super Integer> list){
        list.add(new Integer(50));
    }
    
    public static void main(String[] args) {
        List<Number> intList = new ArrayList<>();
        intList.add(new Integer(3));
        intList.add(new Integer(5));
        intList.add(new Integer(10));
        
        add(intList);
        for (int i = 0; i < intList.size(); i++) {
            System.out.println(intList.get(i));            
        }        
    }    
}
