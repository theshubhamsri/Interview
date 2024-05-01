package Reflection.ReflectionOfFields;

import java.lang.reflect.Field;

public class SettingValuesInFields {
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
          Class eagleClass=Eagle.class;
          Eagle eagleObj=new Eagle();

          Field field=eagleClass.getDeclaredField("breed"); // get private and public field both
          //field.setAccessible(true); //We use this to modify the value of private field because we can't access private field of a
          //class from outside
          field.set(eagleObj,"eagleBrownBreed");
        System.out.println(eagleObj.breed);
    }
}
