package pkgclass.pkg47_collection_framework_basic;

import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;
import java.util.TreeMap;
import java.util.TreeSet;

public class CollectionFrameworkExample {

    public static void main(String[] args) {
        
        System.out.println("Collection Framework: List");
        //List allow duplicat value or object
        List l = new LinkedList();
        l.add("List:angle");
        l.add("schildt");
        l.add("mathew");
        l.add("schildt");
        print(l);
        
        System.out.println("\nCollection Framework: HashSet");
        //Set dont allow duplicat value or object
        Set s = new HashSet();
        s.add("set:rose");
        s.add("schildt");
        s.add("mathew");
        s.add("schildt");
        print(s);
        
        System.out.println("\nCollection Framework: TreeSet");
        /*TreeSet is by default Sorteded and dont allow
        *   duplicate method
        */
        System.out.println("Sorteded and dont allow duplicate method");
        SortedSet ss = new TreeSet();
        ss.add("set:jasmine");        
        ss.add("schildt");
        ss.add("mathew");
        ss.add("schildt");
        print(ss);
        
        //LinkedHashSet
        System.out.println("\nCollection Framework: LinkedHashSet"
                + "\nDont allow duplicate method");
        LinkedHashSet sss = new LinkedHashSet();
        sss.add("List:angle");        
        sss.add("Physics");
        sss.add("Chymistry");
        sss.add("Math");
        sss.add("Chymistry");
        print(sss);
        
        //MAP
        //map("key", "vallue")
        System.out.println("\nCollection Framework: Map");
        System.out.println("Collection Framework: MAP");
        System.out.println("Dont allow duplicate key in Map");
        System.out.println("But it hava a null key");
        System.out.println("keySet() sorted the key by natural order");
        Map m1 = new HashMap();
        m1.put("map", "HashMap");
        m1.put("schiltd", "java2s");
        m1.put("mathew", "Hyden");
        m1.put("schiltd", "java2");
        print(m1.keySet());
        print(m1.values());
        
        //TreeMap
        System.out.println("\nCollection Framework: TreeMap");
        System.out.println("Sorted method and sorted by key");
        SortedMap sm = new TreeMap();
        sm.put("map", "TreeMap");
        sm.put("Schildt", "java2");
        sm.put("mathew", "Hyden");
        sm.put("Schildt", "java2s");
        print(sm.keySet());
        print(sm.values());
        
        //LinkedHashMap        
        System.out.println("\nCollection Framework: LinkedHashMap");
        LinkedHashMap lhm = new LinkedHashMap();
        lhm.put("map", "LinkedHashMap");
        lhm.put("schildt", "java2");
        lhm.put("mathew", "Hyden");
        lhm.put("schildt", "java2s");
        print(lhm.keySet());
        print(lhm.values());
        
    }
    static void print(Collection coll){
        Iterator iter = coll.iterator();
        while (iter.hasNext()) {
            String elem = (String) iter.next();
            System.out.print(elem+ " ");            
        }
        System.out.println( );
    }

}
