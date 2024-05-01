package Reflection.ReflectionOfClasses;

import java.lang.reflect.Modifier;

public class Main {
    public static void main(String[] args) throws ClassNotFoundException {
        //Class eagleClass=Eagle.class;  //Creating class object using .class method
        //Class eagleClass=Class.forName("Reflection.ReflectionOfClasses.Eagle");  //Creating class object using forName() method
        Eagle eagle=new Eagle();
        Class eagleClass=eagle.getClass();    //creating class object using getClass() method
        System.out.println(eagleClass.getName());
        System.out.println(Modifier.toString(eagleClass.getModifiers()));
    }
}
