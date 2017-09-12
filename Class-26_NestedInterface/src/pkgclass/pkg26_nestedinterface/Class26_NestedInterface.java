/*
* An interface can also be nested
* If we say Displayable_Interface then we have to override show() method.
* If we say Displayable_Interface.Message then we have to override msg() method. (Inside the nested interface)
*
*
 */

package pkgclass.pkg26_nestedinterface;

public class Class26_NestedInterface implements Displayable_Interface.Message{

    
    public static void main(String[] args) {
//        Class26_NestedInterface obj = new Class26_NestedInterface();
//        obj.show();
        Displayable_Interface.Message message = new Class26_NestedInterface();
        message.msg();
    } 

//    @Override
//    public void show() {
//        System.out.println("Hello nested interface");
//    }

    @Override
    public void msg() {
        System.out.println("Hello nested interface");    
    }

       
}
