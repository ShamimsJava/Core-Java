/*
 This is multi line comments
 */

package kind_of_comments;

//This is single line comment

public class Kind_of_Comments {
    
    //This is Documentation comment
    /**
     * This is a method to Sum of two double
     * @param x this is first parameter
     * @param y this is second parameter
     * @return this method returns a double value
     */
    private double addTwoNumber(double x, double y){
        return x+y;
    }
    public static void main(String[] args) {
        Kind_of_Comments kofc = new Kind_of_Comments();
        double sum = kofc.addTwoNumber(40.5, 60.5);
        System.out.println("Sum is: "+sum);
    }
    
}
