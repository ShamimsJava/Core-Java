/*
 *valueof() method receive string value but it return the value convert inio integer
 */

package pkgclass.pkg23_3_valueofdemo;

public class Class23_3_ValueOfDemo {
    
    public static void main(String[] args) {
        Integer intWrapper1 = Integer.valueOf("12345");
        //Converting from binary to decimal
        Integer intWrapper2 = Integer.valueOf("11011", 2);
        //Converting from hexadecimal to decimal
        Integer intWrapper3 = Integer.valueOf("D", 16);
        
        System.out.println("Value of intWrapper1 Object: "+intWrapper1);
        System.out.println("Value of intWrapper2 Object: "+intWrapper2);
        System.out.println("Value of intWrapper3 Object: "+intWrapper3);
        System.out.println("");
        
        System.out.println("Hexa value of intWrapper1: " +Integer.toHexString(intWrapper1));
        System.out.println("Hexa value of intWrapper1: " +Integer.toBinaryString(intWrapper2));

    }
    
    
}
