package Multithreading.ThreadJoining;

public class Main {
    public static void main(String[] args) throws InterruptedException {

        System.out.println("-------------------Main Thread Started---------------------");

        Thread th1= new Thread(()->{
            System.out.println("Thread 1 running");
            try {
                Thread.sleep(2000);
            }
            catch (Exception e){
                //logic
            }
            System.out.println("Thread: "+Thread.currentThread().getName()+" Completed");
        });
        th1.start();
        th1.setPriority(5);  //We can set the priority of the thread but this doesn't guarantee the thread execution order
        th1.setDaemon(true);  //To set a thread to Daemon thread, Runs asynchronous
        // Daemon thread is alive till any one user thread is alive, Uses: In garbage collector, Auto save in the editor

        //If we have invoked join method on th1 the current thread (main) will be blocked
        //and wait for the specific thread (th1) to finish
        th1.join();
        System.out.println("-----Main thread finished work-----------");
    }
}
