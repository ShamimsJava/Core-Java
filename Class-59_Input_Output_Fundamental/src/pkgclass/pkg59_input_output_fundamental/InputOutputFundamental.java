
package pkgclass.pkg59_input_output_fundamental;

import java.io.BufferedReader;
import java.io.FileReader;

public class InputOutputFundamental {

    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new FileReader("e:/newFile_2.txt"));
            //We can use one forword slach(/) or two back slach(\\).
            String sCurrentLine;
            
            while((sCurrentLine = br.readLine()) != null){
                System.out.println(sCurrentLine);
            }
            br.close(); 
            /*After work we should close thr BufferedReader object br. 
            * We can also do this closing work in finaly block
            * When we try to create an object br of BufferedReader class and 
            *   BufferedReader dont find any object, it alrady create an object reference of br.
            * when the control goes while((sCurrentLine = br.readLine()) != null){}
            *   line it cannot read ang get an exception. then program control jump to
            * catch(){} block. And then it cannot execute the line br.close();
            * For this reasion we write this line br.close();in finaly(){} block.
            * Then it close the line.
            */
        } 
        catch (Exception e) {
            e.printStackTrace();
        } 
    }    
}
