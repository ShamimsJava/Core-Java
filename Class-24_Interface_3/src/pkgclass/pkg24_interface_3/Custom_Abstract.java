/*
 * The class that implements an interface can be abstract.
 * If the class is abstract then it is not compalsory to overridr method.
 * But if the class is abstract then we cannot create an object of the class.
 * Abstract class is concrite class.
 */

package pkgclass.pkg24_interface_3;

/**
 *
 * @author HP PC
 */
public abstract class Custom_Abstract implements MyInterface{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Custom_Abstract cu = new Custom_Abstract() {};
        cu.ruhul();
        cu.Programmer();
    }

    @Override
    public void ruhul() {
        System.out.println("Hello Md. Ruhul Amin");
    }

    @Override
    public void Programmer() {
        System.out.println("Hello Md. Ruhul Amin Is a Programmer");
    }
    
}
