/*
 * Interface in Java
 * In a interface a method have no bodypart.
 * we declare an Interface by the keyword interface.
 * We can declare the same thing that can declare in a class like method, variable etc.
 * We use interface so that a class use multiple interface. 
 * When a class use an interface we must override the method of the interface.
 * In an interface a METHOD is implicitely public and abstract. abstract is an keyword. 
 * In an interface a VARIABLE is public static and final.
 * If we declare a method by using the keyword abstract then it have no body part. 
 */

//Static members can access directly from a static or non statis class.

/*
* When a class impliments an interface it creat a relation (Is a relation) like class.
*/

package pkgclass.pkg24_interface;

/**
 *  Date: 03/09/2016
 *  Time: 11.45 PM
 * @author Md. Ruhul Amin
 */

/*The class who implements another class it can be abstract
* Public abstract class My_Interface implements Animal_interface_1{}
* If the class is abstract itself then we have no need to override any method to the implimented class compulsory.   
* We cannot creat an Object to a abstract class
*/
public class My_Interface implements Animal_interface_1{

       My_Interface(){
           //x = 44; //final variable
       }
       
       //method_1
       public int customMethod_1(){
           return 10;
       }
       //method_2
       public int customMethod_2(){
           return 20;
       }
       
    public static void main(String[] args) {
        My_Interface m = new My_Interface();
        m.eat();
        m.travel();
        
        System.out.println("\nValu from customMethod_1 method: " +m.customMethod_1());
        System.out.println("Valu from customMethod_2 method: " +m.customMethod_2());
        
        System.out.println("\nValu of x from Animal Interface: " +Animal_interface_1.x);
    }

    @Override
    public void eat() {
        System.out.println("This eat() method is an Override method.");
    }

    @Override
    public void travel() {
        System.out.println("This travel() method is an Override method.");
    }
    
}
