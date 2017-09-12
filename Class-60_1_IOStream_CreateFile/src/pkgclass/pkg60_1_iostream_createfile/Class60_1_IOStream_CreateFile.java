package pkgclass.pkg60_1_iostream_createfile;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;

public class Class60_1_IOStream_CreateFile {

    public static void main(String[] args) throws Exception{
        FileOutputStream fout = new FileOutputStream("e:/IOStream_CreateFile.txt");
        BufferedOutputStream bout = new BufferedOutputStream(fout);
        
        String s = "This is about Java input-output file example. Read or write file as byte";
        byte b[] = s.getBytes();
        bout.write(b);
        
        bout.flush();
        bout.close();
        
        System.out.println("File create successfully");
        
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
