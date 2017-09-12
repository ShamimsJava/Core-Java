
package pkgclass.pkg9_2_.pkgpackage.use_of_array;

public class Class9_2_PackageUse_of_array {

    public static void main(String[] args) {
        
        int[][] ary_1 = new int[3][];
        
        ary_1[0] = new int[3];
        ary_1[1] = new int[3];
        ary_1[2] = new int[3];
        
        int ary_2[][] = {{1,2,3},{4,5,6}, {7,8,9}};
        for(int i = 0; i<ary_2.length; i++){
            for(int j=0; j <ary_2[i].length; j++){
                
                System.err.print(ary_2[i][j]+"  ");
            }
            System.err.println("\n");
        }
        
    }
    
}
