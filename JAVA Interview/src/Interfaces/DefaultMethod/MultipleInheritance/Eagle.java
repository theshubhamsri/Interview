package Interfaces.DefaultMethod.MultipleInheritance;

public class Eagle implements Bird,LivingThing{

    //We have to override because it will throw error program doesn't know which one
    //To be invoked
    @Override
    public boolean canBreath() {
        return Bird.super.canBreath();
    }
}
