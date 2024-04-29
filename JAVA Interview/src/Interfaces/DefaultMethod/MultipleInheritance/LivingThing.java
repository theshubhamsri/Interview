package Interfaces.DefaultMethod.MultipleInheritance;

public interface LivingThing {
    default boolean canBreath(){
        return true;
    }
}
