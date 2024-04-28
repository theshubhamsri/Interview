package ImmutableClass;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Object> petName=new ArrayList<>();
        petName.add("Cat");
        petName.add("Dog");
        MyImmutableClass myImmutableClass=new MyImmutableClass("myname",petName);
        myImmutableClass.getPetNameList().add("Donkey");
        System.out.println(myImmutableClass.getPetNameList());
    }
}
