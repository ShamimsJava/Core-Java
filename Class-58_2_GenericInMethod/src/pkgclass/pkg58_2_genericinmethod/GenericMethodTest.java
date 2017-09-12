
package pkgclass.pkg58_2_genericinmethod;

public class GenericMethodTest {

    //Generic method printArray
    public static <E> void printArray(E[] inputArray){
        //Display array elements
        for (E element : inputArray) {  //Advanced for loop
            System.out.printf("%s ", element);
        }
        System.out.println();
    }
    public static void main(String[] args) {
        //Create arrays of Integer, Double and Character
        Integer[] intArray = {1, 2, 3, 4, 5};
        Double[] doubleArray = {1.1 , 1.2 , 1.3, 1.4, 1.5};
        Character[] charArray = {'H', 'E', 'L', 'L', 'O',' ','W', 'O', 'R', 'L', 'D'};
        String[] stringArray = {"Hello World"};
        
        System.out.println("Array intArray contains: ");
        printArray(intArray); //pass an Integer array
        
        System.out.println("Array doubleArray contains: ");
        printArray(doubleArray); //pass a Double array
        
        System.out.println("Array charArray contains: ");
        printArray(charArray); //pass a Character array
        
        System.out.println("Array stringArray contains: ");
        printArray(stringArray); //pass a Character array
    }
    
}
