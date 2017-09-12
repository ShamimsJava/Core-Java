/*
* We use Generic in different place, for example,
*   a class, method, constructor cab be generic type, even an interface can be generic. 
*/
package pkgclass.pkg54_generics;

import java.util.ArrayList;
import java.util.List;

public class Class54_Generics {

    public static void main(String[] args) {
        List list = new ArrayList();
        list.add(new Integer(2));   //We can add any object in a list
        list.add("A String");   //We can add any object in a list
        System.out.println((Integer)list.get(0));   //Explicit casting needed.
        System.out.println((String)list.get(1));    //Explicit casting needed.
        
        List<String> myList = new ArrayList();
        myList.add("A String again");
        //myList.add(new Integer(2)); //compile time type safety
        System.out.println(myList.get(0)); //No explicit casting needed.
        
        for (String s : myList) {
            System.out.println(s);
        }
        
    }
    
}
