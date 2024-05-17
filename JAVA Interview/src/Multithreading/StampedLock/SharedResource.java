package Multithreading.StampedLock;

import java.util.concurrent.locks.StampedLock;

public class SharedResource {
    int a=10;
    StampedLock lock=new StampedLock();
    public void producer(){
        long stamp=lock.tryOptimisticRead();
        try {
            System.out.println("Taken optimistic lock: ");
            a = 11;
            Thread.sleep(8000);
            //We put the thread to sleep for 8 second in this time the
            //Thread in consumer will put the write lock and it will modify the stamp value
            //now here in optimistic lock the stamp validation will fail because it has been changed by the writer
            //lock in the consumer() method will change the stamp value
            //Optimistic read doesn't put a lock instead uses the stamp for the validation/invalidation of operation
            if (lock.validate(stamp)) {
                System.out.println("Record updated successfully");
            } else {
                System.out.println("Roll back the data someone has modified the value");
                a = 10;
            }
        }
       catch(Exception e){

            }
    }


    public void consumer(){
        long stamp=lock.writeLock();
        System.out.println("Write lock acquired by: "+Thread.currentThread().getName());
        try{
            System.out.println("Performing work");
            a=9;
        }
        finally {
            lock.unlockWrite(stamp);
            System.out.println("Write lock released by :"+Thread.currentThread().getName());
        }
    }
}
