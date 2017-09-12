/*
 * 1. To have control on the instantiation of the Java objects,
 *       it wont allow you to create an instance of an object.
 * 2. It wont allow the class to be Subclassed
 * 3. This has a special advantage when implementing the singleton Pattern,
 *       Private constructors are used for it and have a control on the
 *       creating the instance of the whole application.
 * 4. When you want to have a class with all constants or all of your method,
 *       in a class are static defined and does not require
 *       its instance any more, then we declare the class as a Private constructor.*
 */

/*
* Singleton ensure that at a time we create only one object of the class.
*/

/*
* A class can have a private constructor.
* When a constructor is private then the pattern is called Singleton Pattern.
* Factory mathod return the object of the class.
 */
package pkgclass.pkg37_singletonpattern;

public class SingletonClass {
    //static Class Reference 

    private static SingletonClass obj = null;
    
    private SingletonClass(){
        /*Private constructoe will prevent the instantiation 
        *of this class directly.
        */
    }
    
    public static SingletonClass getInstance(){
        //tThis logic ensure that no more one obgect can be created at a time.
        if(obj == null){
            obj = new SingletonClass();
        }
        return obj;
    }
    
    public void display(){
        System.out.println("Singleton Class Example");
    }

    public static void main(String[] args) {
        SingletonClass obj = SingletonClass.getInstance();
        obj.display();
    }

}
