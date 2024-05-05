package Collection.ComparatorAndComparable;

import java.util.Arrays;

public class ComparatorSortingDetails {
    public static void main(String[] args) {
        Integer[] a={1,2,8,4,2};
        //Comparator doesn't do the sorting there is already sorting algorithm there
        //In that sorting algorithm we are passing the comparator via lambda expression
        //Which is getting used as a condition inside the sorting algorithm (uses compare() method internally)
        //To know more explore the Arrays.sort() function
        //In the comparator Below three conditions get evaluated and returned
        // o1>o2 return 1
        //o1==02 return 0
        //o1<o2 return -1
        Arrays.sort(a,(Integer m,Integer n)->m-n);
        int[] x={7,8,9,0};
        Arrays.sort(x);
    }
}
