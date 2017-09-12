package pkgclass.pkg21_objective_type_casting;

class Animal{
    int health = 100;
}

class Cat extends Animal{
    
}
public class Class21_Objective_Type_Casting {
       
    public static void main(String[] args) {
        Animal aml = new Animal();
        Cat c = new Cat();
        //Upcasting is implicit and safe
        aml = c; //no cast needed for pcasting
        /**Converting an instance of a subclass to an
         * instance of a superclass loss the information
         * down-casting is always explicit
         */
        c = (Cat) aml;
        System.out.println(c.health);
    }
    
}
