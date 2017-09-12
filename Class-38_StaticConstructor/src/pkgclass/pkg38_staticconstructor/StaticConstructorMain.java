/*
* A constructor cannot be static
* Static keyword is related with class and instant is related with object.
* When we create an object constructor of the class is called
*   but if a constructor is static then it initialize with the class
*   so a constructor cannot be static.
 */

package pkgclass.pkg38_staticconstructor;

class StaticConstructor{
    
    //public static StaticConstructor(){
    public  StaticConstructor(){
        System.out.println("Superclass");
    }
}

public class StaticConstructorMain extends StaticConstructor{

    void someMethod(){
        System.out.println("Method in Subclass");
    }
    
    public static void main(String[] args) {
        StaticConstructorMain stm = new StaticConstructorMain();
        stm.someMethod();
    }
    
}
