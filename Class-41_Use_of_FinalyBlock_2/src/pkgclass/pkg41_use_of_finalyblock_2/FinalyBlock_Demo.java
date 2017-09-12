package pkgclass.pkg41_use_of_finalyblock_2;

public class FinalyBlock_Demo {

    public int process(int x, int y) {
        try {
            return x / y;
        } catch (ArithmeticException e) {
            System.err.println("Exception thrown: " + e);
            return x/y;
        } finally {
            System.out.println("Finally block is always executed");
        }
    }

    public static void main(String[] args) {
        FinalyBlock_Demo fd = new FinalyBlock_Demo();
        float f = fd.process(6, 0);
        System.out.println("x/y =" +f);
    }

}
