/*
 *Field variable Initializing
 */

package pkgclass.pkg10_declaring.and.initializing.field.variable;

import java.util.Date;

public class Class10_Declaring_And_Initializing_Field_Variable {
    
    // Field variable declaration
    // Field variable means global variable.
    
    //Explicit means done by the programmer. Implicit means done by the JVM or the tool , not the Programmer.

    double d = 12.9999;         //Initializing using default value.
    Date date = new Date();     //Initializing using explicit value.
    String s;                   //Initializing using constructor.

    public Class10_Declaring_And_Initializing_Field_Variable(String s) {
        this.s = s;
    }     
    
    public static void main(String[] args) {
        
        Class10_Declaring_And_Initializing_Field_Variable  obj = new Class10_Declaring_And_Initializing_Field_Variable("Ruhul");
        System.err.println("Value of d: "+obj.d);
        System.err.println("Value of date: "+obj.date);
        System.err.println("Value of s: "+obj.s);
        
    }
    
}
