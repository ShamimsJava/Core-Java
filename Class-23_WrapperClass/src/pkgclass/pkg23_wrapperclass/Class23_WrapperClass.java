/*
*We cannot use the primitive datatype as an Object. For this reasion every primitive datatype have 
*it's corrosponding class. For example Integet for int, Characrer for char etc.
*We can cast primitive to wrapperb and wrapper to primitive.
*/
package pkgclass.pkg23_wrapperclass;

public class Class23_WrapperClass {

    public static void main(String[] args) {
       int pInt = 420;
       Integer wInt = new Integer(pInt);    //This is called boxing
       int p2 =  wInt;  //This is called unboxing
       //Toghter boxing and unboxing is called autoboxing.
       System.out.println(p2);
    }
    
}
