package Singleton;

public class LazyInitialization {
    private static LazyInitialization lazyInitialization;

    private LazyInitialization(){}

    public static LazyInitialization getInstance(){

        //In case of multithreading it might be possible two thread access this block at same time
        //So they will create two object so to tackle this condition we can synchronise this method (synchronized public static LazyInitialization getInstance()) so that
        //at a time only one thread can access it because it is using synchronised if there are many threads this will perform
        //slow because everytime it will lock and unlock for each thread even if the object has been created
        if(lazyInitialization==null) {
            lazyInitialization=new LazyInitialization();
        }
        return lazyInitialization;
    }
}
