package GenericClass;

public class GenericMethod {
    public <T,V> void printValue(PrintMoreThanOneGeneric<T,V> pair1,PrintMoreThanOneGeneric<T,V> pair2){
        pair2.getValue();
        System.out.println(pair2.getValue());
    }
}
