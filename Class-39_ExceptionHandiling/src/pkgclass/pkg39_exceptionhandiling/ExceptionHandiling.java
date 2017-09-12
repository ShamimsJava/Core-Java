/*
 * Exception is any kind of abnormal situation
 * In our program, when create an abnormal situation then the program
 *       desplay an error or an exception for the abnormal situation.
 */
package pkgclass.pkg39_exceptionhandiling;

public class ExceptionHandiling {

    public static void main(String[] args) {
        
        try{
        int x = 2;
        int y = 34/x;   //ArithmeticException
        int z[] = new int[2];
        System.out.println(z[2]);        
        }
        //We must have at least one catch block with a try block.
        //We can also use more catch blocb
        catch(ArithmeticException e){
            System.err.println("You have a problem at calculation");
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.err.println(e);
        }
        finally{
        System.out.println("Finished");
        }
    }

}
