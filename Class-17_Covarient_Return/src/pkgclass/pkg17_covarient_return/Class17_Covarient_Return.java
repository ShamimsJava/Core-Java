/*
 *Covarient return includ in JDK-5 or Java 5.
 */
package pkgclass.pkg17_covarient_return;

class SuperA {

    int x = 1;
}

class SunB extends SuperA {

    int y = 2;
}

class Base {

    SuperA getObject() {
        System.out.println("Base");
        return new SuperA();
    }
}

public class Class17_Covarient_Return extends Base {

    @Override
    SuperA getObject() {
        System.out.println("CovarientReturn");
        return new SunB(); 
    }

    public static void main(String[] args) {
        Base base = new Class17_Covarient_Return();
        System.out.println(base.getObject() instanceof SunB);
        System.out.println(base.getObject().x);
    }

}
