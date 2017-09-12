
package pkgclass.pkg14_instance.vs.parameters.ambiguity.and.pass.the.current.object;

public class Class14_InstanceVsParameters {
    
    //instance variable
    int x;
    String y;
    
   public Class14_InstanceVsParameters(int x, String y){
       //resolve ambiguity between variable and parameter
       this.x = x;
       this.y = y;
   }
   
   void sum(int x, int y){
       System.out.println("Sum is: "+(x+y));
   }
   
   void doYYY(String[] args){
       RecRef ref = new RecRef();
       //passing current object as a parameter to anather method.
       ref.doxx(this);
       ref.doMM(x);
       
   }
    
   
    public static void main(String[] args) {
        
    }
    
    class RecRef{
        void doxx(Class14_InstanceVsParameters rr){
            rr.sum(6, 5);
        }
        
        void doMM(int s){
        
        }
    }
    
}
