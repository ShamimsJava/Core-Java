/*
 *Where we use String, StringBuffer or StringBuilder
 * We use String when our text is not change.
 * Use StringBuffer when our text is change and access from a single thread.
 * Use StringBuilder when our text is change and access from a multi thread.
 */


package pkgclass.pkg19_2;

public class Class19_2 {
    
    public static String concatWithString(){
        String t = "Cat";
        for(int i = 0;i < 10000; i++){
            t = t.concat("Dog");
        }
        return t;
    }
    
    public static String concatWithStringBuffer(){
        StringBuffer sb = new StringBuffer("Cat");
        for(int i = 0; i < 10000; i++){
            sb = sb.append("Dog");
        }
        return sb.toString();
    }
    
    public static String concatWithStringBuilder(){
        StringBuilder sb = new StringBuilder("Cat");
        for(int i = 0; i < 10000; i++){
            sb = sb.append("Dog");
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        concatWithString();
        System.out.println("Concat with String took: " +(System.currentTimeMillis()-start) + "ms");
        
        start = System.currentTimeMillis();
        concatWithStringBuffer();
        System.out.println("Append with StringBuffer took: " +(System.currentTimeMillis()-start) + "ms");
        
        start = System.currentTimeMillis();
        concatWithStringBuilder();
        System.out.println("Append with StringBuilder took: " +(System.currentTimeMillis()-start) + "ms");
    }
    
}
