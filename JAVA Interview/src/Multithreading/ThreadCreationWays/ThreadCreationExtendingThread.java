package Multithreading.ThreadCreationWays;

public class ThreadCreationExtendingThread extends Thread{
    @Override
    public void run(){
        System.out.println("code executed by the thread"+Thread.currentThread().getName());
    }
}
