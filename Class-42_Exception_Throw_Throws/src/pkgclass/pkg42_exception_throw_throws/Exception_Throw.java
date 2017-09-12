/*
 * The throw keyword is used to explictily throw an exception.
 * We can throw either checked or unchecked exception.
 * The throw keyword is mainly used to throw custom exception.
 */

//Checked and unchecked exception.

/*
* Unchecked exception:- Runtime exception and it's all subclasses with 
*   Error and its all subclasses are unchecked exception.
* Checked exception:- The exception without Runtime exception and 
*   it's subclasses are checked exception.
*/

package pkgclass.pkg42_exception_throw_throws;

public class Exception_Throw {
    static void validDate(int age){
    //static void validDate(int age)throws ClassNotFoundException{
        if(age < 18)
        throw new ArithmeticException("Not allowed");
        
        /*
        *We generally trow unchecked exception in throe
        *   but if we want to trow checked exception in throe
        *   we must use to throws after method signature.
        * ## trow is only for unchecked exception ## 
        */
        //throw new ClassNotFoundException("Not allowed");
        
        //throw expertion throw somthing to ArithmeticException
        // Here it throw -> "Not allowed".
        else{
            System.out.println("Welcome to vote");
        }
    }
    
    public static void main(String[] args) {
        //If we use throw eacption in a method,
        //we should call the method using try-catch.
        //We should handel it by using try-catch and it call propaget
        try{
            validDate(13);
        }catch(ArithmeticException e){
        //}catch (ClassNotFoundException e){
            //catch block catch the trrow exception and print "Not allowed".
            System.out.println(e);
        }
        
        System.out.println("Rest of the code...");
    }
    
}
