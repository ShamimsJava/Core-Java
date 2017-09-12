/*
 * Java is pass by value. It have not pointer concapt 
 * The primative type is pass by value and object type is pass by reference
 */

package pkgclass.pkg15_passbyvalue;

public class Class15_PassByValue {
    
    //primitive type are pass by value
    int data = 50;
    
    void change(int data){
        data = data + 100;  //Change will be only the local variable
        System.out.println("Data in method: "+data);
        return;
    }
    
    //Object are pass by reference
    void changeByObj(Class15_PassByValue e){
        e.data = 200;
        return;
    }
    
    public static void main(String[] args) {
        Class15_PassByValue cpv = new Class15_PassByValue();
        System.out.println("Before change: "+cpv.data);
        cpv.change(55);
        System.out.println("After change by pass by value: "+cpv.data);
        cpv.changeByObj(cpv);
        System.out.println("After change by pass by reference: "+cpv.data);
        
    }
    
}
