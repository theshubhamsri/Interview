package Singleton;

public class BillPugh {
    //Private so outside this class it can't be modified
    private BillPugh(){

    }
    //Private so that it can be accessed only inside this class
    //All the nested class are not loaded at the runtime they are only loaded when they are referred
    private static class NestedClass{
        private static final BillPugh BILL_PUGH=new BillPugh();
    }

    public static BillPugh getInstance(){
        return NestedClass.BILL_PUGH;
    }
}
