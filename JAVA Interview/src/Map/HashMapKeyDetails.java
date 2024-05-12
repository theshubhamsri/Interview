package HashMap;

import java.util.HashMap;

public class HashMapKeyDetails {
    public static void main(String[] args) {
        //If ob1==pb2 then their hashcode must be same
        //If two object has same hash code then it's not always necessary they should be equal
        //Object structure how values are stored inside a map
//        final int hash;
//        final K key;
//        V value;
//        HashMap.Node<K,V> next;
        //Using put we create the above object and if there is a collision then a linked list get created at that index
        //Using get we generate the hash then index get calculated and the particular key gets searched and returns value
        //
        //It will be an array of the above Node object
        //Default hashmap capacity =16 everytime capacity get exceeded it gets multiplied by 2 like 32
        //If size exceeds threshold
        //Default load factor is 0.75
        //16*0.75=12 when key value pair exceeds it rehashes and increase the size (double the size)
        //TREIFY_THRESHOLD initial is 8  (As soon as the collision happens and the linkedlist at a particular index grows more than this
        //size it converts the linkedlist into binary search tree (red black tree) (search is o(logn))
        //Thread safe implementation HashTable(Same as HashMap doesn't allows null key, null value) , ConcurrentHashMap
        HashMap<String,Integer> mp=new HashMap<>();


        //Map.Entry<String,Integer>
    }
}
