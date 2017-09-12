package Static_Variable;


public class Static_Variables {
     private static double salary;   //private static variable
    int x; // instance or non-static variable
    public static final String DEPARTMENT = "Development";  //  DEPARTMENT is a constang
    
    void test(){
        x = 0;
        salary = 720;
    }
    
    public static void main(String[] args){
        //x = 0;    //static member cannot access a non-static member directely
        Static_Variables sv = new Static_Variables();
        sv.x = 100000;
        salary = 45000;
        System.out.println("Value of x is : " +sv.x);
        System.out.println(DEPARTMENT+"average salary is: " +salary);
    }
    
}
