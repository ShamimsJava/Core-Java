/*
 * Custom Exception Implimentation
 */
package pkgclass.pkg42_1_exception_throws;

public class Exception_Throws {

    static void validDate(int age) throws InvalidAgeException {
        if (age < 18) {
            throw new InvalidAgeException("Not valid");
        }
        else{
            System.out.println("Welcome to vote");
        }
    }

    public static void main(String[] args) {
        try{
            //validDate(13);
            validDate(45);
        }catch(InvalidAgeException e){
            System.out.println(e);
        }
        finally{
            System.out.println("Rest of code....");
        }
    }
}
