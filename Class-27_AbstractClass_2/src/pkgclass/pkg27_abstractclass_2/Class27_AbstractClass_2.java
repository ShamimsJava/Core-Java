/*
*
*
 */

package pkgclass.pkg27_abstractclass_2;

abstract class Figure{
    double dim1;
    double dim2;
    int x = 4;

    public Figure(double a, double b) {
        this.dim1 = a;
        this.dim2 = b;
    }
    
    //abstract method
    abstract double area();
    
    void sum(){
        
    }
    
}

class Rectangle extends Figure{

     Rectangle(double a, double b) {
        super(a, b);
        int d;
    }

    @Override
    double area() {
        System.out.println("Inside Area for Rectangle");
        return dim1*dim2;
    }
    
}

class Triangle extends Figure{

     Triangle(double a, double b) {
        super(a, b);
        int d;
    }

    @Override
    double area() {
        System.out.println("Inside Area for Triangle");
        return dim1*dim2/2;
    }
    
}

public class Class27_AbstractClass_2 {
    
    public static void main(String[] args) {
        //Figure f = new Figure(10, 10);
        //We cannot create any object of abstract class.
        
        Rectangle r = new Rectangle(9, 5);
        Triangle t = new Triangle(10, 8);
        Figure figure; //This is ok, no object is creatrd. Reference created
        figure = r;
        System.out.println("Area is " +figure.area());
        
        figure = t;
        System.out.println("Area is " +figure.area());
    }
    
}
