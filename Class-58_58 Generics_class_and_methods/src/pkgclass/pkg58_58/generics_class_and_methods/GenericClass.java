/*
* The type parameter section of a generic class can have 
*   one or more type parameters separated by commas.
* These classes are known as parameterized classes or parameterized
*   types because they accept one or more parameters.
 */

//Our own Generic type class
/*
* We can creat our own generic type class.
* For create a Generic type class we use a dimond head after the class name.
* Example:- public class GenericClassDemo<T>
* Here T is any generic type. When we create any object of GenericClassDemo
*   class then which type we pass, this type is passed by T. For this reasion
*   we say, we pass type by generic type.
* We use T for any generic type and E for exception.
*/

//We can apply generic type like this, in an interface.
package pkgclass.pkg58_58.generics_class_and_methods;

public class GenericClass<T> {

    private T t;
    
    public void add(T t){
        this.t = t;
    }
    
    public T get(){
        return t;
    }
    
    public static void main(String[] args) {
       
        GenericClass<Integer> integerBox = new GenericClass<>();
        GenericClass<String> stringBox = new GenericClass<>();
        
        integerBox.add(new Integer(10));
        stringBox.add(new String("Hello World"));
        
        System.out.printf("Integer Value: %d\n", integerBox.get());
        System.out.printf("String Value: %s\n",stringBox.get());
    }    
}