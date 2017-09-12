package pkgclass.pkg60_1_iostream_showfile;

import java.io.BufferedInputStream;
import java.io.FileInputStream;

public class Class60_1_IOStream_ShowFile {

    public static void main(String[] args) {
        
        try{
            FileInputStream fin = new FileInputStream("e:/IOStream_CreateFile.txt");
            BufferedInputStream bin = new BufferedInputStream(fin);
            
            int i;
            while((i = bin.read()) != -1){
                System.out.print((char) i);
            };
            fin.close();
        }
        catch(Exception e){
            e.printStackTrace();
        }
        System.out.println("");
    }
    
    
    
    
}
