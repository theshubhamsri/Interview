package Multithreading.Synchronized;

public class SharedResource {
   boolean isAvailable=false;

   public synchronized void producer(){
      try{
         System.out.println("Lock acquired by thread: "+Thread.currentThread().getName());
         isAvailable=true;
         Thread.sleep(4000);

      }
      catch(Exception e){

      }
      System.out.println("Lock released by thread: "+Thread.currentThread().getName());
   }
}
