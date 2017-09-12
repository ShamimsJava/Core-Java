/*
 * Example of Exception Propagation
 * Exception Propagation means if any method have the probrblity to be an exception
 *   we have to handle one of the method by try-catch block in ihe method life cycle
 *
 */
package pkgclass.pkg43_exceptionpropagation;

public class ExceptionPropagation {

    void m() {
        int data = 50 / 0;
//        try {
//            int data = 50 / 0;
//        } catch (Exception e) {
//            e.printStackTrace();
//       }
    }

    void n() {
        m();
    }

    void p() {
        try {
            n();
        } catch (Exception e) {
            System.out.println("Exception Handle");
        }
    }

    public static void main(String[] args) {
        ExceptionPropagation ep = new ExceptionPropagation();
        ep.p();
        System.out.println("Normal flow......");
    }

}
