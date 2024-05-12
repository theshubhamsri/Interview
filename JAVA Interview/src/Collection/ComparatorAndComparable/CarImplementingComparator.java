package Collection.ComparatorAndComparable;

import java.util.Comparator;

public class CarImplementingComparator implements Comparator<CarImplementingComparator> {
    String carName;
    String carType;
    CarImplementingComparator(){

    }
    CarImplementingComparator(String carName, String carType) {
        this.carName = carName;
        this.carType = carType;
    }

// We need to pass the object in the Arrays.sort()/Collections.sort()
//While sorting we need to override the compare() method of the Comparator interface
//compare() accepts two argument
//Which is getting used inside the sorting algorithm, We can create a separate class implementing the comparator interface
//and then we can pass object of that class to the collections.sort()/Arrays.sort()
//-----------Return values by compareTo() method used below
//    the value 0 if the argument string is equal to this string;
//    a value less than 0 if this string is lexicographically less than the string argument;
//    and a value greater than 0 if this string is lexicographically greater than the string argument.
//  In most of the algorithm value will be swapped if it is returning 1
    @Override
    public int compare(CarImplementingComparator o1, CarImplementingComparator o2) {
        return o1.carName.compareTo(o2.carName);
    }
}
