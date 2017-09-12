package pkgclass.pkg45_exceptionoverriden_rules;

import java.io.EOFException;
import java.io.IOException;

public class Class45_ExceptionOverriden_Rules {

    //Rule 1: superclass method does not declare an exception
    void msg() {
        System.out.println("Parent Class");
    }

    //Rule 1: superclass method declare an exception
    void somMethod() throws IOException {
        //method body
    }

    public static void main(String[] args) {

    }
}

class Test extends Class45_ExceptionOverriden_Rules {
    
    /*Rule 1: subclass overridden method 
    *   1.a cannot not declare an exception
    *   1.b or the checked exception (Like IOException)but
    *   1.c can declare unchecked exception (like ArithmeticException)
    */

    //-valid (no exception)
    void msg(){
        System.out.println("Child Class");
    }
    
    //    -valid (unchecked exception)
//    void msg() throws ArithmeticException {
//        System.out.println("Child Class");
//    }
    
    //    -invalid (checked exception)
//    void msg() throws IOException {
//        System.out.println("Child Class");
//    }
    
    /*
    *Rule 2: Subclassoverriddrn method can 
    * 2.a declare same,
    * 2.b subclass exception or no exception but cannot
    * 2.b declare parent exception.
    */
    
    //same-normally valid
//    @Override
//    void somMethod() throws IOException {
//        //method body 
//    }
        
        //-valid coz EOFException is a subclass of IOException
//    @Override
//    void somMethod() throws EOFException {
//        //method body 
//    }
    
    //Not valid coz Exception is a subclass of IOException
//    @Override
//    void somMethod() throws Exception {
//        //method body 
//    }
   
}
