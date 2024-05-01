package Reflection.ReflectionOfMethods;

import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) {
        Class eagleClass=Eagle.class;
        Method[] methods=eagleClass.getMethods(); //Returns all public method
       // Method[] methods=eagleClass.getDeclaredMethods(); //Returns all public and private methods
        for(Method method:methods){
            System.out.println("Method name: "+method.getName());
            System.out.println("Return type: "+method.getReturnType());
            System.out.println("Class name: "+method.getDeclaringClass());
            System.out.println("**********");
        }
    }
}
