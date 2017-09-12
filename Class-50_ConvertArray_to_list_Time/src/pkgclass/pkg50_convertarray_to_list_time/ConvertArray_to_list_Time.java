/*
 * Convert Array to List time.
 */
package pkgclass.pkg50_convertarray_to_list_time;

import java.util.Arrays;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class ConvertArray_to_list_Time {

    public static void main(String[] args) {
        
        String sArray[] = createArray();
        
        //convert aray to list
        List list = Arrays.asList(sArray);
        
        System.out.println("--------#1 Iterator loop--------");
        long IteratorStartTime = new Date().getTime();
        System.out.println("Start Time : "+IteratorStartTime);
        
        //iterator loop
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            String string = iterator.next();           
        } 
        long IteratorEndtTime = new Date().getTime();
        System.out.println("End Time : "+IteratorEndtTime);
        
        long IteratorDifference = IteratorEndtTime - IteratorStartTime;
        System.out.println("Required Time: "+IteratorDifference);
        System.out.println("--------END--------\n");
        
        //for loop        
        System.out.println("--------#2 for loop--------");
        long forStartTime = new Date().getTime();
        System.out.println("Start Time: "+forStartTime);
        
        for(int i = 0; i < list.size(); i++){
            String string = (String) list.get(i);
        }
        long forEndTime = new Date().getTime();
        System.out.println("Start Time: "+forEndTime);
        
        long forDifference = forEndTime - forStartTime;
        System.out.println("Required Time: "+forDifference);
        System.out.println("--------END--------\n");
        
        //while loop
        System.out.println("--------#3 while loop--------");
        long whileStart = new Date().getTime();
        System.out.println("Start Time: "+whileStart);
        
        int j = 0;
        while(j < list.size()){
            String string = (String) list.get(j);
            j++;
        }
        
        long whileEnd = new Date().getTime();
        System.out.println("Start Time: "+whileEnd);
        
        long whileDifference = whileEnd - whileStart;
        System.out.println("Required Time: "+forDifference);
        System.out.println("--------END--------\n");
        
    }
    
    //User defined method
    static String[] createArray(){
        String sArray[] = new String[550000];
        for (int i = 0; i < 550000; i++) {
            sArray[i] = "Array: "+i;
        }
        return sArray;
    }

}
