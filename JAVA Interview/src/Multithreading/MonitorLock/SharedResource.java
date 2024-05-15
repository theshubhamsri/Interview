package Multithreading.MonitorLock;

public class SharedResource {
     boolean itemAvailable=false;
      public synchronized void addItem(){
          itemAvailable=true;
          System.out.println("Item added by: "+Thread.currentThread().getName()+" invoking all the threads waiting");
          notifyAll();
      }

      public synchronized void consumeItem(){
          System.out.println("Consume item method invoked by thread: "+Thread.currentThread().getName());
          // We could have used if as well here but while to avoid the spurious wakeup due to noise
          while(!itemAvailable){
              try {
                  System.out.println("Thread " + Thread.currentThread().getName() + " is waiting now! ");
                  wait();  //Releases the monitor lock
                  // For an object only one monitor lock doesn't matter if the thread is trying to access different block/function
              }
              catch (Exception e){
                  //Exception handling logic
              }
          }
          System.out.println("Item consumed by thread: "+Thread.currentThread().getName());
          itemAvailable=false;
      }
}
