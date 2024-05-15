package Multithreading.ThreadCreationWays;

public class Main {
    public static void main(String[] args) {
        //Using extends Thread class
        System.out.println("Going inside main method: "+ Thread.currentThread().getName());
        ThreadCreationExtendingThread threadCreationExtendingThread=new ThreadCreationExtendingThread();
        threadCreationExtendingThread.run();
        System.out.println("Finished main method"+Thread.currentThread().getName());
        //-------Using implements runnable----------//
        System.out.println("-----------Going inside the main method-------------"+Thread.currentThread().getName());
        Thread td=new Thread(new ThreadUsingRunnable());
        td.start();
        System.out.println("-----------Finished main method---------------+"+Thread.currentThread().getName());
        //---------------------Using lambda expression---------//
        System.out.println("-----------------Using Lambda Expression-------------------"+Thread.currentThread().getName());
        Thread td1=new Thread(()->{  System.out.println("code executed by the thread"+Thread.currentThread().getName()); });
        td1.start();
        System.out.println("-----------------End of the main after lambda expression----"+Thread.currentThread().getName());
    }
}
