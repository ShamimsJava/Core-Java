/*
*instanceof operator return true if the two object is same and return false if they are not same 

*/

package pkgclass.pkg25_instanceofoperator;

class SuperA{
    int x = 1;
}

class SubB extends SuperA{
    int y = 2;
}

class Base{
    SuperA getObject(){
        System.out.println("Base");
        return new SuperA();//Call annonymus object by new SuperA
    }
}
        
public class InstanceOfOperator extends Base{

    @Override
    SuperA getObject() {
        System.out.println("Covarient Return!");
        return new SubB();
    }

   
    public static void main(String[] args) {
        Base test = new InstanceOfOperator();
        System.out.println(test.getObject() instanceof SubB);
        System.out.println(test.getObject().x);
    }
    
}
