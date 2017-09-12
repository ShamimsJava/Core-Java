/*
 * (b)Annonynous inner class
 * We cannot create Object of interface and abstract class, so we use this as an inner class
 * We can understand the defult interface by seeing the three letters abl at the edd of the interface name. Example Closable, Rnable.
 * 
 */

package pkgclass.pkg26_nesterclass_2_annonymusinner;

interface Eatable{
    void eat();
}

public class TestAnnonymousInner1 {

    public static void main(String[] args) {
        Eatable e = new Eatable() {

            @Override
            public void eat() {
                System.out.println("Override method: eat()");
            }
        };
        e.eat();
        
        //Or we can write
        
//        new Eatable() {
//
//            @Override
//            public void eat() {
//                System.out.println("Override method: eat()");
//            }
//        }/*All the above is a object of Eatable*/.eat();
        //Since it is an statement we shall use the semecolon(;).
    }

   
}
