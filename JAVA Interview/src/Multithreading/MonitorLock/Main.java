package Multithreading.MonitorLock;

public class Main {
    public static void main(String[] args) {
        System.out.println("-------------Main method starts--------------");
        SharedResource sharedResource=new SharedResource();

        //-----Lambda expression can be used here as well instead of creating object
        Thread consumerThread=new Thread(new ConsumerTask(sharedResource));
        Thread producerThread=new Thread(new ProducerTask(sharedResource));

        producerThread.start();
        consumerThread.start();

    }
}
