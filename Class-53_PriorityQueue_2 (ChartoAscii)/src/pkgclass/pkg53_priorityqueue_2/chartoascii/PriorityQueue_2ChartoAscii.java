
package pkgclass.pkg53_priorityqueue_2.chartoascii;

public class PriorityQueue_2ChartoAscii {

    public static void main(String[] args) {
        char[] alphabets = {'b', 'e', 'd', 'h', 'j', 'a', 'c', 'f', 'g', 'p', 
        'i', 'B', 'E', 'D', 'H', 'J', 'A', 'C', 'F', 'G', 'I'};
        
        for (int i = 0; i < 20; i++) {
            char c = alphabets[i];
            System.out.println(c+"= "+(int)c );
        }
    }
    
}
