package pkgclass.pkg41_use_of_finalyblock;

public class Use_of_FinalyBlock {

    public static void main(String[] args) {
        try {
            int x = 0;
            int y = 34;
            int z[] = new int[2];
            System.out.println(z[3]);

        }catch(ArithmeticException e){
            System.err.println("You have a problem at calculation");
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println(e);
        }
        finally{
            System.out.println("Finish........");
        }

    }

}
 