package Multithreading.MonitorLock;

public class ProducerTask implements Runnable{
     SharedResource sharedResource;

     ProducerTask(SharedResource sharedResource){
         this.sharedResource=sharedResource;
     }
    @Override
    public void run() {
        System.out.println("Producer thread: "+Thread.currentThread().getName());
        try{
            Thread.sleep(5000l);
        }
        catch(Exception e){
            //Exception handling logic
        }
        sharedResource.addItem();
    }
}
