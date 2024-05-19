package Multithreading.AtomicAndVolatileVariable;

import java.util.concurrent.atomic.AtomicInteger;

public class SharedResource {
    //This uses CAS (Compare and Swap Method)
    // The CAS operation takes (memory, expectedvalue, increment) it will check if the value at the memory
    //is equal to the expected value then it will perform the increment and if someone has modified in between it will
    //read it again and update the value, It will keep trying unless the CAS operation is successful
    //We have AtomicBoolean, AtomicLong, AtomicReference we can't consider this as alternative to lock based mechanism
    //It's use case is  very specific
    AtomicInteger counter=new AtomicInteger(0);

    //Counter++ operation is not atomic it is basically counter=counter+1
    //So if thread will access randomly it will miss some of the value
    //Because the value lies in cache and if the value is not updated in the main memory that value will be lost
    //Read/Write operation happens from the memory itself

    public void increment(){
        counter.incrementAndGet();
    }

    public int get(){
        return counter.get();
    }
}
