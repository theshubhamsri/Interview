package Multithreading.StampedLock;

public class StampedLock {
    //Support read write lock
    //Support optimistic read also (optimistic read doesn't put a lock instead uses stamp)
    public static void main(String[] args) {
        SharedResource resource=new SharedResource();
        Thread th1=new Thread(
                ()->{
                    resource.producer();
                }
        );

        Thread th2=new Thread(
                ()->{
                    resource.consumer();
                }
        );

//        th1.start();
//        th2.start();

        SharedResourceStampedLockWithReadWriteLock resource1=new SharedResourceStampedLockWithReadWriteLock();
        SharedResourceStampedLockWithReadWriteLock resource2=new SharedResourceStampedLockWithReadWriteLock();

        Thread t3=new Thread(()->{
            resource1.producer();
        });

        Thread t4=new Thread(()->{
            resource1.producer();
        });

        Thread t5=new Thread(()->{
            resource2.consumer();
        });
        Thread t6=new Thread(()->{
            resource1.consumer();
        });

        t3.start();
        t4.start();
        t5.start();
        t6.start();
    }
}
