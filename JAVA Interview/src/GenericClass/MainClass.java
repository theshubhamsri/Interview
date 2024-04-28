package GenericClass;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class MainClass {
    public static void main(String[] args) {
//        Print<Integer> p=new Print<Integer>();
//        p.setValue(2);
//        Integer printVal=p.getPrintValue();
//        System.out.println(printVal);
//        ColourPrint<String> colourPrint=new ColourPrint();
//        colourPrint.setValue("5");
//        System.out.println(colourPrint.getPrintValue());
//        PrintMoreThanOneGeneric<String,Integer> printMoreThanOneGeneric=new PrintMoreThanOneGeneric();
//        printMoreThanOneGeneric.put("X",2);
//        System.out.println(printMoreThanOneGeneric.getValue());
//        GenericMethod genericMethod=new GenericMethod();
//        PrintMoreThanOneGeneric<String,Integer> ob1=new PrintMoreThanOneGeneric();
//        ob1.put("X",3);
//        PrintMoreThanOneGeneric<String,Integer> ob2=new PrintMoreThanOneGeneric();
//        ob2.put("Y",5);
//        genericMethod.printValue(ob1,ob2);
        /*Raw type we don't pass the type parameter while creating the object internally compiler passes the parameter as Object*/
//        Print p=new Print();
//        p.setValue(2);
//        //System.out.println(printVal);
        UpperBound<BigDecimal> upperBound=new UpperBound();
        upperBound.setPrintValue(new BigDecimal("123.450"));
        System.out.println(upperBound.getPrintValue());

        List<Vehicle> vehicleList=new ArrayList<>();
        vehicleList.add(new Bus());
        vehicleList.add(new Car());
        List<Bus> busList=new ArrayList<>();
        busList.add(new Bus());
        busList.add(new Bus());
        PrintMultiBound printMultiBound=new PrintMultiBound();
        printMultiBound.setPrintValues(busList);
    }
}
