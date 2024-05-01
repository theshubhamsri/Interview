package Reflection.InvokingMethodUsingReflection;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) throws NoSuchMethodException, InstantiationException, IllegalAccessException, InvocationTargetException {
        Class eagleClass=Eagle.class;

        Object eagleObject=eagleClass.newInstance();
        Method flyMethod= eagleClass.getMethod("fly",int.class,boolean.class,String.class);
        flyMethod.invoke(eagleObject,1,true,"hello");
    }
}
