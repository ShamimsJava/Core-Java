/*
 * Why we Create Inheritance Relation? 
 * We can use a class by create an object of the class. But we have some common thing that use all class
 * and some special thing that use another class. For example in a company all members are Employee but a 
 * few members are Managers. Here we can create Employee class as Super class and Managers class as Sub 
 * Class. Manager is also a Employee of the company.
 */

package pkgclass.pkg16_inheritance_manager;

//Super Class
class Employee{
    public String name;
    public int employeeId;
    
    //No argument constructor
    public Employee(){
        this.employeeId = 1;
        this.name ="Sagor";
    }
    
    //Constructor of Employee class
    public Employee(String name, int id) {
        this.name = name;
        this.employeeId = id;
    }
    //Method
    String getDetails(){
        return "Id is: "+employeeId+ " and Name is: "+name;
    }    
}

//Sub Class
public class Class16_Inheritance_Manager extends Employee{
    
    public String department;

    public Class16_Inheritance_Manager(String department, String name, int id) {
        //We must call the super constructor at first.
        super(name, id);
        this.department = department;
    }

    //Runtime polymorphysum
    /*
    *Accessicitivity rules
    *The access modifire of a override should equal or less than the method in inheritance relation.
    */
    
    @Override
     String getDetails() {
        return "Subdetails";  
        
    } 

    public static void main(String[] args) {
      
        Class16_Inheritance_Manager mgr = new Class16_Inheritance_Manager("IT", "Mr. A", 1);
        mgr.print();
        Employee e = new Class16_Inheritance_Manager("X", "B", 1);
        mgr = (Class16_Inheritance_Manager)e;
        System.out.println(mgr.getDetails());
    }
    
   void print(){
        System.out.println("Name: "+ name);
        System.out.println("Department: " +department);
    }
    
}