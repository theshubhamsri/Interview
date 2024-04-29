package Interfaces.DefaultMethod;

public interface Bird {
    public void canFly();
    //We don't need to provide the implementation of this in child classes
    //Ex. stream API
    default int getMinimumFlyHeight(){
        return 100;
    }
}
