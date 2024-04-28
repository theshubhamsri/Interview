package GenericClass;

public class Print<T> {
     T value;
     public T getPrintValue(){
         return value;
     }
     public void setValue(T value){
         this.value=value;
     }
}
