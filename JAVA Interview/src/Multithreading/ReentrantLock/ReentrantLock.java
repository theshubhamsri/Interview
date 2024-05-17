package Multithreading.ReentrantLock;

public class ReentrantLock {
    public static void main(String[] args) {
        //This will put a lock irrespective of the condition that
        //it is for a different object
        //ReentrantLock lock =new ReentrantLock();
        //Below we are using two different object of shared resource but at a time only one thread can put the lock
        //It is not dependent on the shared resource object like monitor lock
        SharedResource resource1=new SharedResource();
        SharedResource resource2=new SharedResource();
        java.util.concurrent.locks.ReentrantLock lock=new java.util.concurrent.locks.ReentrantLock();
        Thread t1=new Thread(
                ()->{
                    resource1.consumer(lock);
                }
        );

        Thread t2=new Thread(
                ()->{
                    resource2.consumer(lock);
                }
        );

        t1.start();
        t2.start();
    }
}
