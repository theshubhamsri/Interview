package Singleton;

public class EagerInitialization {

    //Static so that it is at class level and only one object will be created
    private static EagerInitialization eagerInitialization=new EagerInitialization();

    //No outside method can create the object because private constructor
    //Can't be accessed outside so it can't be created/modified
    private EagerInitialization(){

    }
    //Public method to get the object outside of the class
    public static EagerInitialization getInstance(){
        return eagerInitialization;
    }
}
