package Interfaces.DefaultMethod.MultipleInheritance.PrivateMethodAndPrivateStaticMethod;

public interface Bird {
    void canFly(); // This is equivalent to public abstract void canFly();

    public default void minimumFlyHeight(){
        myPrivateMethod();
        myPrivateStaticMethod();
        myStaticPublicMethod();
    }

    static void myStaticPublicMethod(){
        myPrivateStaticMethod();
    }

    private void myPrivateMethod(){

    }

    private static void myPrivateStaticMethod(){

    }
}
