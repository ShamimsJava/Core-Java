/*
 * The main Feature of an Abstract class is
 * if we can declare a method() without bodypart in this class the method should be abstract.
 * The method of interface is implicitly abstract but the method of Abstract class is not. So we explicitly declare it.
 */

package pkgclass.pkg26_nestedclass_3_annonymusinner_abstract;

abstract class Person{
    
    abstract void eat();
}
public class AnnonymusInner_Abstract {

    public static void main(String[] args) {
        new Person() {

            @Override
            void eat() {
                System.out.println("Override Method");
            }
        }.eat();
    }
    
}
