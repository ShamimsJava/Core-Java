/*
* In a Abstract class we can create abstract and non-abstract method.
* The method inside an interface is implecitely public and abstract.
* We can declare a method externelly abstract when the class is abstract.
* Abstract method have no bodypart.
* We cannot create Object of a abstract method
* A class can extends an abstract class, but we must override the bastract method.
 */

package pkgclass.pkg27_abstractclass;

//abstract method
abstract class A{
    abstract void callme();
    
    void callmetoo(){
        System.out.println("This is a concreat method!");
    } 
}

class B extends A{

    @Override
    void callme() {
        System.out.println("B's implementation of callme");
    }
    
}
public class Class27_AbstractClass {
    
    public static void main(String[] args) {
        B b = new B();
        b.callme();
        b.callmetoo();
    }
    
}
