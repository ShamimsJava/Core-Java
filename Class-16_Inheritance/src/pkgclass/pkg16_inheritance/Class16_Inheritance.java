/*
*Java is single inheritance. For reslve ambigious problem java is single inheritance.
*Java support multiple inheritance by using Interface.
*
*/

package pkgclass.pkg16_inheritance;

//Here Parent class is called Super class or parent
class Parent{
    int p1, p2;
    
    void showp1p2(){
        System.out.println("p1: "+p1+" and p2: "+p2);
    }
}

//Here Parent class is called Sub class or child class
//child class is also known as inheritance class
class Child extends Parent{
    int p3;
    
    void showP3(){
        System.out.println("P3: "+p3);
    }
    
    void sum(){
        System.out.println("p1+p2+p3: "+(p1+p2+p3));
    }
}

public class Class16_Inheritance {

    public static void main(String[] args) {
        Parent p = new Parent();
        Child c = new Child();
        p.p1 = 1;
        p.p2 = 2;
        System.out.println("Content of parent class: ");
        p.showp1p2();
        
        System.out.println();
        c.p1 = 10;
        c.p2 = 20;
        c.p3 = 30;
        System.out.println("Content of Child class: ");
        c.showp1p2();
        c.showP3();
        c.sum();
    }
    
}
