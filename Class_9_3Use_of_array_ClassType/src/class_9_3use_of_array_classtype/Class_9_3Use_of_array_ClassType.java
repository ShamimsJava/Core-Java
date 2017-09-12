
package class_9_3use_of_array_classtype;

class Array_Class{
    int a;
    String b;

    public Array_Class(int a, String b) {
        this.a = a;
        this.b = b;

    }
    
    public void showData(int i){
        i++;
        System.err.println("Array Class: "+i);
        System.err.println("Id is: "+a);
        System.err.print("Name is: "+b);
        System.err.println("\n");
    }
}

public class Class_9_3Use_of_array_ClassType {

 
    public static void main(String[] args) {
        
        Array_Class array_Class[] = new Array_Class[3];
        array_Class[0] = new Array_Class(12001, "Ruhul");
        array_Class[1] = new Array_Class(12002, "Reza");
        array_Class[2] = new Array_Class(12003, "Borna");
        
        for(int i = 0; i < 3; i++){
            array_Class[i].showData(i);
        }
        
        
       
    }
    
}
