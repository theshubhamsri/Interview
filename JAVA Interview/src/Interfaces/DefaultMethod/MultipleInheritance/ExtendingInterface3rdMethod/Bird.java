package Interfaces.DefaultMethod.MultipleInheritance.ExtendingInterface3rdMethod;

public interface Bird extends LivingThing{

    //Child can implement their own method or can use parents method using ClassName.super.FunctionName()
    default boolean canBreathe(){
        boolean canBreatheOrNot=LivingThing.super.canBreathe();

        return canBreatheOrNot;
    }

}
