package encapsulationTest;

import pkgclass.pkg36_encapsulation.EncapsulationDemo;


public class EncapsulationTest {
    public static void main(String[] args){
        EncapsulationDemo obj = new EncapsulationDemo();
        obj.setEmpCode(1234);
        obj.setEmpName("Md. Ruhul Amin");
        obj.setEmpAge(27);
        
        System.out.println("Employee Name: "+obj.getEmpName());
        System.out.println("Employee Code: "+obj.getEmpCode());
        System.out.println("Employee Age: "+obj.getEmpAge());
    }
}
