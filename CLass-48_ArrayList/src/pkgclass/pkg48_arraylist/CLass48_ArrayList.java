/*
* ArrayList is a list and it allow duplicate value
* When we run a loop inside a list for faster random access then we use AtrrayList.
* We can use all kind of loop in ArrayList.
 */

package pkgclass.pkg48_arraylist;

import java.util.ArrayList;

public class CLass48_ArrayList {

    public static void main(String[] args) {
        /*here ArrayList<String> is use for create gegeric ArrayList.
        * <> is called dimond head
        */
        ArrayList<String> list = new ArrayList();
        System.out.println("Size: "+list.size() + " and Element"
                + "inside the ArrayList: "+list);
        
        //Add some Element into ArrayList
        list.add("A");
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        list.add("E");
        list.add("F");
        list.add("G");
        list.add(2, "s"); //Add "s" in second possition
        
        System.out.println("Size: "+list.size() + " and Element"
                + "inside the ArrayList: "+list);
        
        //Remove some element from the ArrayList
        list.remove("A");   //remove the first element "A"
        list.remove(2);     //remove the third element "B"
        System.out.println("Size: "+list.size() + " and Element"
                + "inside the ArrayList: "+list);
        
        //Replace element "C" with "R"
        list.remove("C");
        list.add(2, "R");
        System.out.println("Size: "+list.size() + " and Element"
                + "inside the ArrayList: "+list);
        //Looping array list
        for (int i = 0; i < list.size(); i++) {
            String s = list.get(i);
            System.out.print(s+" ");
        }
        System.out.println("\n");
    }
    
}
