package pkgclass.pkg40_exception_printing;

public class Class40_Exception_Printing {

    public static void main(String[] args) {
        int d = 0;
        int x = 42;
        try {
            int y = x / 0;
            int a[] = new int[2];
            System.out.println("Accessing element there: " + a[3]);
        } catch (ArithmeticException e) {
//            System.out.println("Expression thrown: " + e);
//            System.err.println("Expression thrown: " +e);
            e.printStackTrace();
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Expression thrown: " + e);
        } finally {
            System.out.println("Out of the block");
        }
    }

}
