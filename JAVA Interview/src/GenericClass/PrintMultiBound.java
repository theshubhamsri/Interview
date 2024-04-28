package GenericClass;

import java.util.List;
// ? extends upper bound wild card child classes are also allowed (Class name and below)

public class PrintMultiBound{
     public void setPrintValues(List<? extends Vehicle> vehicleList){

     }
     // Class name and it's above are allowed
     public void setPrintValuesLowerBound(List<? super Vehicle> vehicleList){

     }
     //With generic type we can have multiple public <T,M,K,V> stc.
}
