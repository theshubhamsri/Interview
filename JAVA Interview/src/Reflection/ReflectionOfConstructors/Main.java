package Reflection.ReflectionOfConstructors;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Modifier;

public class Main {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {

        Class eagleClass=Eagle.class;
        Constructor[] eagleConstructorList=eagleClass.getDeclaredConstructors();
        for(Constructor constructor:eagleConstructorList){
            System.out.println("Modifier: "+ Modifier.toString(constructor.getModifiers()));
            constructor.setAccessible(true);  //Used to access the private attributes
            Eagle eagleObj=(Eagle) constructor.newInstance();
            eagleObj.fly();
        }
    }
}
