package GenericClass;

public class PrintMoreThanOneGeneric <T,U>{
    private T key;
    private U value;
    public void put(T key,U value){
        this.key=key;
        this.value=value;
    }
    public String getValue(){
        return (String)key+value;
    }
}
