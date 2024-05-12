package Map;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapImpl {
//    Map is Sorted according to its natural ordering of its Key or by Comparator provided during map creation.
//    Its based on Red-Black tree (Self balancing Binary Search Tree)
//    O(logn) time complexity of insert, remove, get operations.
//    TreeMap implements NavigableMap (NavigableMap extends SortedMap, SortedMap extends Map)
    //Below field are present inside the object (node) which stores the data
    //in TreeMap
    // Left, Parent, Key, Value, Right
    public static void main(String[] args) {
        Map<Integer, String> map1= new TreeMap<>((Integer key1, Integer key2)->key2-key1);
        map1.put(21, "SJ");
        map1.put(11, "PJ");
        map1.put(13, "KJ");
        map1.put(5, "TJ");
       //decreasing order
        map1.forEach((Integer key, String value)-> System.out.println(key+":"+value));
        System.out.println("---------------------------------");
        Map<Integer, String> map2 =new TreeMap<>();
        map2.put(21, "SJ");
        map2.put(11, "PJ");
        map2.put(13, "KJ");
        map2.put(5, "TJ");
        //increasing order
        map2.forEach((Integer key,String value) -> System.out.println(key+":"+value));
    }
}
