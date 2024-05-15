package Multithreading.ThreadCreationWays;

public class ThreadUsingRunnable implements Runnable{
    @Override
    public void run() {
        System.out.println("Code executed by the thread: "+Thread.currentThread().getName());
    }
}
