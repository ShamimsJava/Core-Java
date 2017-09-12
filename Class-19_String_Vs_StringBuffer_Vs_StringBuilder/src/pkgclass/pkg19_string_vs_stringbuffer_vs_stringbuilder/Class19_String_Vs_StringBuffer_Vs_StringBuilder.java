/*
 * String class is Immutable, StringBuffer is mutable.
 * String buffer is faster when performing concatenations.
 * This is because when we concatenate a String, we are creating
 * a new object (Internally). Everytime since string is immutable.
 */

package pkgclass.pkg19_string_vs_stringbuffer_vs_stringbuilder;

public class Class19_String_Vs_StringBuffer_Vs_StringBuilder {

    public static void main(String[] args) {
       String s = "Dhaka";
       s.concat("Bangladesh");       
       //s = s.concat(" Bangladesh");
       //If assign s then the object refference change and output is Dhaka Bangladesh.
       System.out.println(s);//output is Dhaka because string class is Immutable.
       
       
       StringBuffer sb = new StringBuffer("Dhaka");
       sb.append(" Bangladesh");
        System.out.println(sb);
    }
    
}
