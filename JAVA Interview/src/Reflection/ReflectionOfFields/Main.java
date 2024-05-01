package Reflection.ReflectionOfFields;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

public class Main {
    public static void main(String[] args) {
        Class eagleClass=Eagle.class;

        //Field[] fields=eagleClass.getFields();   //Get all the public field
        Field[] fields=eagleClass.getDeclaredFields(); //Get all the private and public method

        for(Field field:fields){
            System.out.println("Field Name: "+field.getName());
            System.out.println("Type: "+field.getType());
            System.out.println("Modifier: "+ Modifier.toString(field.getModifiers()));
            System.out.println("**********");
        }

    }
}
