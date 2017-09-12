package pkgclass.pkg56.pkg2_upperbound_pridefinedclass;

import java.util.ArrayList;
import java.util.List;

class SuperClass{
        
    }
    
    class ChildClass extends SuperClass{
        
    }
    
    class GrandChildClass extends ChildClass{
        
    }

public class Class562_UpperBound_PridefinedClass {
    
    public static void main(String[] args) {
        
        //List of grand children
        List<GrandChildClass> grandChildren = new ArrayList();
        grandChildren.add(new GrandChildClass());  
        addGrandChildren(grandChildren); 
        
        //List of grand children
        List<ChildClass> childs = new ArrayList();
        childs.add(new GrandChildClass());  
        addGrandChildren(childs);
        
        //List of grand super
        List<SuperClass> supers = new ArrayList();
        childs.add(new GrandChildClass());  
        addGrandChildren(childs); 
    } 
    
    public static void addGrandChildren(List<? super GrandChildClass>grandChildren){
        grandChildren.add(new GrandChildClass());
        System.out.println(grandChildren);
    }
    
}
