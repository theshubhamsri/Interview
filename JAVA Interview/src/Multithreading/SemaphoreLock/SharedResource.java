package Multithreading.SemaphoreLock;

import java.util.concurrent.Semaphore;

public class SharedResource {
    boolean isAvailable=false;
    //Argument specifies how many thread can access the lock at a time
    Semaphore lock =new Semaphore(2);

    public void producer(){
        try{

            lock.acquire();
            System.out.println("Lock acquire by :"+Thread.currentThread().getName());
            isAvailable=true;
            Thread.sleep(4000);
        }
        catch (Exception e){
            //
        }
        finally {
            System.out.println("Lock released by : "+Thread.currentThread().getName());
            lock.release();

        }
    }
}
