package Interfaces.NestedInterface;

public interface Bird {
    public void canFly();
    public interface NonFlyingBirds{
        public void canRun();
    }
}
