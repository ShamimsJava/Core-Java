
package pkgclass.pkg20_primitive_type_custing;

public class Class20_Primitive_Type_Custing {

    public static void main(String[] args) {
        //String to int
        String s = "13";
        int stoi = Integer.parseInt(s);
        //Or 
        stoi = Integer.valueOf(s).intValue();
        System.out.println("String to Integer: "+stoi);
        
        //int to string
        int i = 14;
        String itos = Integer.toString(i);
        System.out.println("Integer to String: "+itos);
        
        //String to double
        String ss = "13";
        double stod = Double.parseDouble(ss);
        stod = Double.valueOf(s).doubleValue();
        System.out.println("String to Double: "+stod);
        
        //Double to string
        double d = 13.5d;
        String dtos = Double.toString(d);
        System.out.println("Double to String: "+dtos);
        
        //char to int
        char c = 'a';
        int ctoi = c;//no need to explicit cast
        System.out.println("char to int: "+ctoi);
        
        //int to char
        int ii = 97;
        char iitoc = (char) ii;//narrow in.
        System.out.println("Int  to Char: "+iitoc);
        //int to char another method
        //System.out.println(Character.toChars(97));
        
        //String to Charecter
        String sss = "Md. Ruhul Amin";
        char ssstoc = ' ';
        for (int j = 0; j < sss.length(); j++) {
            ssstoc = (char)sss.charAt(j);
            System.out.print(" "+ssstoc);
        }
        System.out.println("");
        
//        String sss = "Ruhul";
//        char ssstoc = ' ';
//        for(int j = 0; j < sss.length(); j++){
//            ssstoc = (char) sss.charAt(j);
//            System.out.print(" "+ssstoc);
//        }
//        System.out.println(" ");
        
                
        //Charecter to String
        char cc = 'M';
        String cctos = String.valueOf(cc);
        System.out.println("Charecter to String: "+cctos);
        
        //Integer to Double widening
        int iii = 5;
        double iiitod = iii;
        System.out.println("Integer to Double: "+iiitod);
        
        //Double to int narrowing
        double ddd = 5.4;
        int dddtoi = (int) ddd;
        System.out.println("Double to Integer: "+dddtoi);
        
    }
    
}
