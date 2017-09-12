/*
 * Local Inner Class
* A class that iscreated inside a method is known as local inner class
* If you want to invoke the method of local inner class,
* you must instantiate this class inside the method.
* 
* 1) Local Inner Class cannot be invoked from outside the method.
* 2) Local Inner Class cannot access non-final local variable.
 */  

package pkgclass.pkg26_nestedclass_4_localinner;
 
public class LocalInner {

   private int data = 30; //instance variable
   
   void display(){
       class Local{ 
           void msg(){
               System.out.println(data);
           }
       }
       Local l = new Local();
       l.msg();
   }
    
    public static void main(String[] args) {
        LocalInner obj = new LocalInner();
        obj.display();
    }
    
}
