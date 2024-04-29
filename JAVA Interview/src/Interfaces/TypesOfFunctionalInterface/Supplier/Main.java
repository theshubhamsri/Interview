package Interfaces.TypesOfFunctionalInterface.Supplier;

public class Main {
    public static void main(String[] args) {
        //Supplier<String> isEvenNumber= ()->"This is the data i'm returning";
        Supplier<String> isEvenNumber= ()->{ return "This is the data i'm returning";};
        System.out.println(isEvenNumber.get());
    }
}
