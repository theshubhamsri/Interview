package Interfaces.DefaultMethod.MultipleInheritance.ExtendingInterface2ndMethod;

public class Eagle implements Bird{

    //We need to override this method because the child interface has abstracted the same parent method
    @Override
    public boolean canBreathe() {
        return false;
    }
}
