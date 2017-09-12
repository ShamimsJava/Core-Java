/*
*enum constants have initial value that start from
*0, 1, 2, 3 and so on. But we can initialize the specific value
*to the enum constants by defining fields and constructors.
*Constructor of enum type is private constructor.
*So we can't create instance of enum using new operator.*
*/
package pkgclass.pkg32.enuminjava_2;

/**
 *
 * @author HP PC
 */
public enum Season{
    
    //WINTER(10), SUMMER(20);   
    WINTER(10){

        @Override
        public String dispSeason() {
            return "Winter";
        }
        
    }, 
    SUMMER(20){

        @Override
        public String dispSeason() {
            return "Winter";        
        }        
    };
    
    public int value;

    private Season(int value) {
        this.value = value;
    }
    
    public abstract String dispSeason();//enum can have abstract method
    
    
}
class Class32EnumInJava_2 {

    
    public static void main(String[] args) {
        for(Season s: Season.values()){
            System.out.println(s+" "+s.value+" "+s.dispSeason());
        }
    }
    
}
