/*
*A class can implements multiple interface but cannot extends multiple class
*Interface solve AMBIGUITY problem.
*/

package pkgclass.pkg24_interface_2;

/**
 *
 * @author HP PC
 */
public class TestImplement implements TestA, TestB{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        TestImplement temp = new TestImplement();
        temp.print();
        temp.printx();
    }

    @Override
    public void print() {
        System.out.println("This method is override from TestA");
    }

    @Override
    public void printx() {
        System.out.println("This method is override from TestB"); 
    }
    
}
