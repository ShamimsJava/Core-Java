
package pkgclass.pkg59_2_writeascharecter;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

public class Class59_2_WriteasCharecter {

    public static void main(String[] args) {
        
        String content_1 = "This is about Input Output Fundamental";
        String content_2 = "This is about Write file in Java Language";
        try{  
            File file = new File("e://newFile_2.txt");
            
            //if file doesnt exists, then create it
//            if(!file.exists()){
//                file.createNewFile();
                FileWriter fw = new FileWriter(file, true);//true means it append the new text with existing file.
                BufferedWriter bw = new BufferedWriter(fw);
                bw.write(content_1);
                bw.newLine();
                bw.write(content_2);
                bw.newLine();
                bw.close();
                
                System.out.println("Done!!");
//            }
//            else{
//                System.out.println("File exists");
//            }
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
    
}
