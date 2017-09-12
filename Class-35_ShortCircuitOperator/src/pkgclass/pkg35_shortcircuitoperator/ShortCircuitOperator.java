/*
* We use logical operator between two condition.
* we can write condition by using conditional operator.
* But for boolean operator we can use comperasion operator ant assain a value at a time.
 */

package pkgclass.pkg35_shortcircuitoperator;

/**
 *
 * @author HP PC
 */
public class ShortCircuitOperator {

    public static void main(String[] args) {
        boolean b = false;
        int x = 5;
        int y = 6;
        int m = 7;
        
//        if((x > y) && (m > x)){ 
//            System.out.println(m);
//        }
        //IF first condition is false (&&) operator don't go second condition.
        if((x > y) && (b = true)){ 
            System.out.println(b+" Ok");
        }
        else{
            System.out.println(b);
        }
        
        //IF first condition is true (||) operator don't go second condition.
        if((x < y) || (b = true)){ 
            System.out.println(b+" Ok");
        }
        else{
            System.out.println(b);
        }
            
        
    }
    
}
