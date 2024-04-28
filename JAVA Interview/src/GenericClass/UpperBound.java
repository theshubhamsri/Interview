package GenericClass;
//Upperbound means T can be of type number or it's subclass only here we can have interface to
public class UpperBound <T extends Number>{
    T value;
    public T getPrintValue(){
        return value;
    }
    public void setPrintValue(T value){
        this.value=value;
    }
}
