package Singleton;

public class DoubleCheckLocking {
    //In CPU different core works together and stores data in cache (L1 cache), So suppose two thread are executed by two different
    //core and one thread has created the object but stored in the cache, so it will not be updated in the memory and sync up between
    //the core didn't happened so the thread working on the other core will end up creating the same object again that's why we use
    //volatile so instead of storing in the cache it will store directly in the memory

    //Volatile makes it slower because it makes thing stored in memory
    private static volatile DoubleCheckLocking doubleCheckLocking;

    private DoubleCheckLocking(){

    }
    public static DoubleCheckLocking getInstance(){
        if(doubleCheckLocking==null){
            //Synchronized makes little bit slower
            synchronized (DoubleCheckLocking.class){
                if(doubleCheckLocking==null){
                    doubleCheckLocking= new DoubleCheckLocking();
                }
            }
        }
        return doubleCheckLocking;
    }
}
