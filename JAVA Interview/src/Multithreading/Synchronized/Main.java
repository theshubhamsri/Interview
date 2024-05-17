package Multithreading.Synchronized;

public class Main {
    public static void main(String[] args) {
        SharedResource resource1=new SharedResource();
        SharedResource resource2=new SharedResource();
        Thread t1=new Thread(()->{
            resource1.producer();
        });

        Thread t2=new Thread(()->{
            resource2.producer();
        });

        t1.start();
        t2.start();
    }
}
