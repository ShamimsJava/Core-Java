package pkgclass.pkg33_enumvsconstant;

public class Class33_EnumVSConstant {

    /*
     *If we change the enum constants, we will get compile time exception
     *which removes any possibility of runtime issues.
     */
    static void enumExample(DayEnum denum) {

        if (denum == DayEnum.SAT) {
            System.out.println("e-Saturday");
        } 
        else if (denum == DayEnum.SUN) {
            System.out.println("e-Sunday");
        } 
        else if (denum == DayEnum.MON) {
            System.out.println("e-Monday");
        } 
        else {
            System.out.println("e-Invalid Day");
        }
     }
        /*
         *We can change the int constants value in DayConstant class
         *but program will not throw any exception
         *although program might not work as expected
         */
        
    static void constantExample(int i) {

        if (i == DayConstant.SAT) {
            System.out.println("C-Saturday");
        } 
        else if (i == DayConstant.SUN) {
            System.out.println("C-Sunday");
        } 
        else if (i == DayConstant.MON) {
            System.out.println("C-Monday");
        } 
        else {
            System.out.println("C-Invalid Day");
        }
    }

public static void main(String[] args) {
        // Enum value are fixed so it provides type safety
        enumExample(DayEnum.SAT);
        enumExample(DayEnum.SUN);
        enumExample(DayEnum.MON);
        enumExample(null);
        
        System.out.println("");
        
        constantExample(1);
        constantExample(2);
        constantExample(3);
        constantExample(4);//we can pass any int to constant
    }
    
}
