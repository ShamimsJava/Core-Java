package pkgclass.pkg28_memory_management;

public class Memory_Management {

    public static void main(String[] args) {
        int i = 1;
        Object obj = new Object();
        Memory_Management mmgt = new Memory_Management();
        mmgt.print(obj);
    }
    
    private void print(Object param){
        String str = param.toString();
        System.out.println("str");
    }
    
}
