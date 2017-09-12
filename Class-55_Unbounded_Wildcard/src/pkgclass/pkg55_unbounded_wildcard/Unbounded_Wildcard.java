/*
*   26-10-2016
* Generics not Covarient
*/
package pkgclass.pkg55_unbounded_wildcard;

import java.util.ArrayList;
import java.util.List;

public class Unbounded_Wildcard {

    public static void main(String[] args) {
        //Valid because an Integer is a Number, and an Integer
        //  array is a Number array
        Integer intArray[] = new Integer[10];
        Number[] numberArray = intArray;
        
        //However, the same is not true with generics.
        //The following code is invalid
        
        List<Integer> intList = new ArrayList();
        /*List<Number> numberList = intList;    //invalid
        *Generic not return covarient.
        *But sometime we need covarient and for this reasion 
        *      we use Wildcard in Generic. 
        */
        
        /*
        *Generally there are two kind of wildcard.
        * 1. Unbounded_Wildcard
        * 2. Bounded_Wildcard
        */
        
    }
    
}
