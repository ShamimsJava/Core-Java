
package pkgclass.pkg18_string;

public class Class18_String {

    public static void main(String[] args) {
        String s1 = "Ruhul";
        String s = "R";
        String s2 = s + "uhul";     //Change object refference when we concat a object with a value.
        // String s3 = s+"uhul" ;
        //String s2 = new String("Ruhul");      //Change object refference
        
        if(s1 == s2){
            System.out.println("== Operator checks Object reference");
        }
        else{
            System.out.println("s1 and s2 are not same object");
        }
        
        if(s1.equals(s2)){
            System.out.println("equals() method checks value");
        }
        else{
            System.out.println("s1 and s2 are different");
        }
        
        String s3 = new String("Ruhul");//new object reference
        String s4 = new String("Ruhul");//new object reference
        //s3 = s4;
        
        if(s3 == s4){
            System.out.println("s3 eq s4");
        }
        else{
            System.out.println("s3 neq s4");
        }

    }
    
}
