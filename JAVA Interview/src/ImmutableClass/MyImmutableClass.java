package ImmutableClass;

import java.util.ArrayList;
import java.util.List;

public final class MyImmutableClass {
    private final String name;
    //Making list final means it's reference will not change
    private final List<Object> petNameList;

    MyImmutableClass(String name, List<Object> petNameList) {
        this.name = name;
        this.petNameList = petNameList;
    }
    public String getName(){
        return name;
    }
    //This is required because making list final,
    //means you can not now point it to new list, but still can add
    //delete values in it so that's why we send copy
    public List<Object> getPetNameList(){
        return new ArrayList<>(petNameList);
    }
}
