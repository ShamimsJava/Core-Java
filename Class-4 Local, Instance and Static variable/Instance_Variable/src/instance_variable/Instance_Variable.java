package instance_variable;

public class Instance_Variable {
    public String name;
    private double salary;
    
    //The name variable assined in the constructor
    public Instance_Variable(String emName){
        name = emName;
    }
    
    //The salary value is assigned a value
    public void setSalary(double emSalary){
        salary = emSalary;
    }
    
    //This method print the InstanceVariable details
    
    public void printEm(){
        System.err.println("Employe name is : "+name);
        System.err.println("Employe salary is : "+salary);
    }
    public static void main(String[] args) {
       
        Instance_Variable IV = new Instance_Variable("Ruhul");
        IV.salary = 50000.0;
        IV.printEm();
        
    }
}
    
