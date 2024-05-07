package Collection.ComparatorAndComparable;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
//        CarImplementingComparable[] array=new CarImplementingComparable[3];
//        array[0]=new CarImplementingComparable("SUV","Petrol");
//        array[1]=new CarImplementingComparable("Sedan","Diesel");
//        array[2]=new CarImplementingComparable("HatchBag","CNG");
        CarImplementingComparator[] array=new CarImplementingComparator[3];
        array[0]=new CarImplementingComparator("SUV","Petrol");
        array[1]=new CarImplementingComparator("Sedan","Diesel");
        array[2]=new CarImplementingComparator("HatchBag","CNG");
        Arrays.sort(array,new CarImplementingComparator());
        for(CarImplementingComparator car:array){
            System.out.println(car.carName+","+car.carType);
        }
    }
}
