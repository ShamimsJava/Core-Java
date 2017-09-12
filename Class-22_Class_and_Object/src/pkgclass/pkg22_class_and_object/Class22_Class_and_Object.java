/*
*Class name is Uppercase
*variable name is lowercase
*pacage name is lowercase
*Constant variabe is all upercase 
*/

/*
*Class is a container of variable, method, block etc.
*Class is a bluprint to creating an Object
*An Object is creating an instance of a class
*/

package pkgclass.pkg22_class_and_object;

class Student{
    
    String name = "Ruhul";
    
    public Student(){
        
    }
}

public class Class22_Class_and_Object {

    public static void main(String[] args) {
          Student student = new Student();
          System.out.println("Name is: "+student.name);
          /*A real life object have three property
          *1.Identity
          *2.State
          *3.Behaviour 
          */
    }
    
}
