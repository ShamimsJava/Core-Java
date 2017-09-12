/*
*An enum is a data type which contains fixed set of constants
*The enum constants are static and final implicitely.
*It improves type safety, can have fields, constructor and methods.
*enum may implement many interfaces but cannot extend any class.
*because it ionternally extends Enum class.
*enum can be defined within or outside the class
*because it is similar to a class
*/
package pkgclass.pkg32.enuminjava;

public class Class32EnumInJava {

    public enum Day{
        SAT,SUN, MON, TUE, WED, THU, FRI//initially SAT=1, SUN=2...
    };  //Semicolon is optional here
    
    public static void main(String[] args) {
        for (Day s : Day.values()) {    //Collection base for loop
            System.out.println(s);
        }
    }
    
}
