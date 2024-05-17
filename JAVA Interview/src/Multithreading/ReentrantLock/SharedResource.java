package Multithreading.ReentrantLock;

import java.util.concurrent.locks.ReentrantLock;

public class SharedResource {

    boolean isAvailable=false;
    //This will put a lock irrespective of the condition that
    //it is for a different object
    //ReentrantLock lock =new ReentrantLock();

    public void consumer(ReentrantLock lock){
        try{
            lock.lock();
            System.out.println("Lock acquired by: "+ Thread.currentThread().getName());
            isAvailable=true;
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        finally{
            System.out.println("Lock released by thread: "+Thread.currentThread().getName());
            lock.unlock();
        }
    }
}
