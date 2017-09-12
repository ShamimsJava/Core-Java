package pkgclass.pkg23_2_wrapper_demo;

public class Class23_2_Wrapper_Demo {

    public static void main(String[] args) {
        Integer intObj1 = new Integer(25);
        Integer intObj2 = new Integer("25");
        Integer intObj3 = new Integer(35);
        
        System.out.println("compareTo() and eeuals method for Integer class");
        //compareTo demo
        System.out.println("Comparing using compareTo Obj1 and Obj2: " + intObj1.compareTo(intObj2));
        System.out.println("Comparing using compareTo Obj1 and Obj3: " + intObj1.compareTo(intObj3));
        //eeuals demo
        System.out.println("Comparing using equals Obj1 and Obj2: " + intObj1.equals(intObj2));
        System.out.println("Comparing using equals Obj1 and Obj3: " + intObj1.equals(intObj3));
        
        System.out.println("compareTo() and eeuals method for Float class\n");
        Float f1 = new Float("2.25f");
        Float f2 = new Float("20.43f");
        Float f3 = new Float(2.25f);
        System.out.println("Comparing using compareTo f1 and f2: "+Float.compare(f1, f2));
        System.out.println("Comparing using compareTo f1 and f3: "+Float.compare(f1, f3));
        
        System.out.println("Comparing using equals f1 and f2: " + f1.equals(f1));
        System.out.println("Comparing using equals f1 and f3: " + f1.equals(f3));
        
        //Addition of integer with Float
        Float f = intObj1.floatValue()+f1;
        System.out.println("Addition of "+intObj1+" and "+f1+"is: "+f);
    }

}
