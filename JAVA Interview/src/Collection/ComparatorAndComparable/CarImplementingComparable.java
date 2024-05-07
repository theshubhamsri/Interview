package Collection.ComparatorAndComparable;

public class CarImplementingComparable implements Comparable<CarImplementingComparable>{
    String carName;
    String carType;

    CarImplementingComparable(){

    }
    CarImplementingComparable(String carName, String carType) {
        this.carName = carName;
        this.carType = carType;
    }
    //We don't need to pass anything while we are calling Arrays.sort() or Collections.sort()
    //Inside the algorithm it is using compareTo() method which we have overwritten
    //
    //We are passing only one object because for the comparison purpose the current object will be used
    //That's why we are using this.ObjectName to access the current object and compare the value with the object passed in the
    //argument
    @Override
    public int compareTo(CarImplementingComparable o) {
        return this.carName.compareTo(o.carName);
    }
}
