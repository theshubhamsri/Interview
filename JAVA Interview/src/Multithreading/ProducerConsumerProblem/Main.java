package Multithreading.ProducerConsumerProblem;

public class Main {
    public static void main(String[] args) {

        SharedResource sharedResource=new SharedResource(3);

        //Creating producer thread
        Thread producerThread=new Thread(()->{
            try{
                for(int i=1;i<=6;i++){
                    sharedResource.produce(i);
                }
            }
            catch (Exception e){
                //Exception handling logic
            }
        });

        //Creating consumer thread

        Thread consumerThread=new Thread(()->{
            try{
                for(int i=1;i<=6;i++){
                    sharedResource.consume();
                }
            }
            catch (Exception e){
                //Exception handling logic
            }
        });

        producerThread.start();
        consumerThread.start();

    }
}
