/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pkgclass.pkg50_convertarray_to_list;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;


public class Class50_ConvertArray_to_List {

    
    public static void main(String[] args) {
        String sArray[] = new String[]{
            "Array 1",
            "Array 2",
            "Array 3"
        };
        //convert Array to list
        List<String> lList = Arrays.asList(sArray);
        
        //Get array element using List
        //Iterator List
        System.out.println("#1 Iterator:");
        Iterator<String> iterator = lList.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
        
        //for loop
        System.out.println("\n#2 for loop: "); 
        for (int i = 0; i < lList.size(); i++) {
            System.out.println(lList.get(i));
        }
        
        //for loop advance
        System.out.println("\n#3 for loop advance: ");
        for (String string : lList) {
            System.out.println(string);
        }
        
        //while loop 
        System.out.println("\n#4 while loop: ");
        int j = 0;
        while(j < lList.size()){
            System.out.println(lList.get(j));
            j++;
        }
                
    }
    
}
