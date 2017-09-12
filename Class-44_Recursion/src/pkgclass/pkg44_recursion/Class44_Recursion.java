/*
*When a method call itself in the body part then the method is 
*   called recursive and this event is called Recursion.
*Recursive must have an ending point.
 */

package pkgclass.pkg44_recursion;

import java.util.Scanner;

public class Class44_Recursion {
    public static long factorial(long n){
        if(n == 0){
            return 1;
        }
        else{
            return n*factorial(n-1);
        }
    }
  
    public static void main(String[] args) {
        
        long m ;
        System.out.print("Enter value: ");
        Scanner s = new Scanner(System.in);
        m = s.nextLong();
        System.out.println(factorial(m));
    }
    
}
