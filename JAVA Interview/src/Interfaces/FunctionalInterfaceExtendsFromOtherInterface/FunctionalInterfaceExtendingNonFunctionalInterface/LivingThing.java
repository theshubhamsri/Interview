package Interfaces.FunctionalInterfaceExtendsFromOtherInterface.FunctionalInterfaceExtendingNonFunctionalInterface;

public interface LivingThing {
    default public boolean canBreathe(){
        return true;
    }
}
