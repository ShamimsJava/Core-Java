public class instance_vs_static_variable {
    
     //A static initialization block, executed once when the class is loaded
        
        static{
            System.out.println("Class instance_vs_static_variable loading......");
        }
        
        // A constant
        static final long ONE_DAY_IN_MALLIS = 24*60*60*1000;
        // A static field
        static int instanceCounter;
        
        // Second static initialization block
        // Static members are processed in the order they appear in the class
        
        static {
            //We can assess the static fields initialized above
            System.out.println("One day = "+ONE_DAY_IN_MALLIS+" Millisecond. " 
                    + "InstanceCounter = "+instanceCounter);
        }
        
        //An instance initialization block
        //instance blocks are executed each time a class instance is created
        
        {
            instance_vs_static_variable.instanceCounter++;
            System.out.println("InstanceCounter = "+instanceCounter);
        }
    public static void main(String[] args) {        
        System.out.println("Statting InstanceCounter");
        
        new instance_vs_static_variable();
        new instance_vs_static_variable();
        new instance_vs_static_variable();
        System.out.println("InstanceCounter in main: " +instanceCounter);       
    }
    
    static {
        System.out.println("Class InstanceCounter loaded");
    }
   
}