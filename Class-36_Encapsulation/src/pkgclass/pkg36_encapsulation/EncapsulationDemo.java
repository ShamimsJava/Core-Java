/*
* In Java Encapsulation use in a broad sense.
*Generally Encapsulation means the process of data hiding.
*We can hide method or variable by using access modifire.(private)
*Use access modifire is one kind of Encapsulation.
*we keep class in a pacage which is one kind of Encapsulation.
*Default class only use same pacage, protected class can only use from sub class.
 */

package pkgclass.pkg36_encapsulation;

public class EncapsulationDemo {
    private int empCode;
    private String empName;
    private int empAge;
    
    //Getter methods
    public int getEmpCode(){
        return empCode;
    }
    
    public String getEmpName(){
        return empName;
    }
    
    public int getEmpAge(){
        return empAge;
    }
    
    //Setter method
    public void setEmpCode(int sempCode){
        this.empCode = sempCode;
    }
    
    public void setEmpName(String sempName){
        this.empName = sempName;
    }
    
    public void setEmpAge(int sempAge){
       this.empAge = sempAge;
    }
    

    
}
