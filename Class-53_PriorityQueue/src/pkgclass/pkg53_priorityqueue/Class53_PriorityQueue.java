/*
* Priority Queue is one kind of pre-processor. That means 
*   after creating a collection we can keep it in Queue.
* 
*
 */

package pkgclass.pkg53_priorityqueue;

import java.util.PriorityQueue;

public class Class53_PriorityQueue {

    public static void main(String[] args) {
       
        String[] alphabets = {"banana", "e", "d", "h", "j", "apple", "c", "pear", "f", "g",
            "i", "B", "E", "D", "H", "J", "A", "C", "F", "G", "I"};
        
        PriorityQueue<String> pq = new PriorityQueue();
        for (int i = 0; i < 20; i++) {
            pq.add(alphabets[i]);
        }
        System.out.println(pq); 
        //Print out and check ordering
        for (int i = 0; i < 20; i++) {
            System.out.println(pq.poll());
        }
    }
    
}
