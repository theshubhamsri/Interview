package Interfaces.FunctionalInterface.UsingImplements;

public class Eagle implements Bird{
    @Override
    public void canFly(String val) {
        System.out.println("Eagle bird implementation");
    }
}
