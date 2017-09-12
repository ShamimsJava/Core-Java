/*
*Variable Length Arguments shoth as varargs.
*This feature includede from JDK-1.5

 */

public class VariableLengthArgument {

    public static void main(String[] args) {
        test(1234, "Dhaka", "Khulana", "Bogura");
        test(2345, "Rajshahi", "Naogaon", "Rungpur", "Nator");
        System.out.println("");
    }
     
    public static void test(int some, String ... args){
        System.out.print("\n" +some);
        //JDK-5 Enhanced for loop
        for (String arg : args) {
            System.out.print("," +arg);
        }
        
    }  
    
}
