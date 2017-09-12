
package pkgclass.pkg42_1_exception_throws;

/**
 *
 * @author HP PC
 */
public class InvalidAgeException extends Exception{
    
    public InvalidAgeException(String s){
        super(s);
        /*We sent the string s to Exception class which back to us.
        *if we not use InvalidAgeException() method we canot
        *sent any string ti Exception class
        */
    }
}
