/*
* We use Inhance or advanced or Iterator  for loop inside collection.
*/

package pkgclass.pkg48_arraylist_2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListLoopingExam {

    public static void main(String[] args) {
        List<String> list = new ArrayList();
        list.add("Text 1");
        list.add("Text 2");
        list.add("Text 3");
        
        //1. Normal for loop
        System.out.println("1. Normal for loop");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        
        //2. Advanced for loop: Inhance
        System.out.println("\n2. Advanced for loop: Inhance");
        for (String tem : list) {
            System.out.println(tem);
        }
        
        //3. While loop
        System.out.println("\n3. While loop");
        int j = 0;
        while(list.size() > j){
            System.out.println(list.get(j));
            j++;
        }
        
        //4. Iterator
        System.out.println("\n4. Iterator");
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            //String string = iterator.next();
            System.out.println(iterator.next());
        }
    }
}
