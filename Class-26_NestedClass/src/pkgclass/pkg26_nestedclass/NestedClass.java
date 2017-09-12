/*
 *If we declare a class inside another class then it called Nested class. 
 *We declare a class inside a class for hide somthin.
 *This concept is called Incapsulation in Java. 
 */

/*
*There are two types of nesed class in java, (1) Non-static nested class (2) Static nested class 
*Non-static nested class are also known as inner class.
*
* (1) Non-static nested class(Inner Class)
*           a)Member inner class
*           b)Annonynous inner class
*           c)Local inner class
*           
* (2) Static nested class
*/

/* (a)Member inner class:- A class created within class and outside method
*Inner class can directly everything of a outer class
*We cannot use Inner class without creating object
*We can create an Object by using Outerclass.Innerclass
*/

/* (b)Annonynous inner class:- Use inside interface and abstreac class
* We cannot create Object of interface and abstreac class so we use this class as an Inner class.

*/

/*Local inner class:- Class inside a method.
*/
package pkgclass.pkg26_nestedclass;

public class NestedClass {
    
    private int data = 30; 
    
    //Nested Class
    //Member inner class
    class Inner{
        void msg(){            
            //Inner class can directly everything of a outer class
            
            System.out.println("Data is: "+data);
            //display();
        }
    }
    
    void display(){
        //We cannot use Inner class without creating object
        Inner in = new Inner();
        //We can also create Object by this way.
        NestedClass.Inner in2 = new NestedClass.Inner();
        in.msg();
    }
    
    public static void main(String[] args) {
        NestedClass obj = new NestedClass();
        obj.display();
    }
    
}
