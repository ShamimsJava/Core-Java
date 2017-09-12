/*
*There are 4 part of a method. 
*3 is compalsary and 1 is optional
*
*Default value of primitive type is different
*Default value of Class type is null
 */

package pkgclass.pkg12_method_declaration;

public class Class12_Method_Declaration {

    int x,y;
    double d;
    String s;

    //Non-Mutator method. This method cannot change the value of a field variable.
    int displaySum(int x, int y){
        return x+y;
    }
    
    //Mutator method. This method change the value of a field variable.
    void setXY(int x, int y){
        this.x = x;
        this.y = y;
    }
    
    public static void main(String[] args) {
        Class12_Method_Declaration obj = new Class12_Method_Declaration();
        obj.setXY(50, 100);
        int sum = obj.displaySum(10, 20);
        System.out.println("Sum = "+sum);
    }
    
}
