package Multithreading.ProducerConsumerProblem;

import java.util.LinkedList;
import java.util.Queue;

public class SharedResource {
    private Queue<Integer> sharedBuffer;
    private int bufferSize;

    public SharedResource(int bufferSize){
        this.bufferSize=bufferSize;
        sharedBuffer=new LinkedList<>();
    }

    public synchronized void produce(int item) throws Exception{
        while(sharedBuffer.size()==bufferSize){
            System.out.println("Buffer is full producer is waiting for consumer");
            wait();
        }
        sharedBuffer.add(item);
        System.out.println("Produced: "+item);
        notify();   //Notify the consumer that there are item in the list
    }

    public synchronized int consume() throws Exception{
        while(sharedBuffer.isEmpty()){
            System.out.println("Buffer is empty consumer is waiting for producer");
            wait();
        }
        int peek=sharedBuffer.poll();
        System.out.println("Consumed: "+peek);
        //Notify producer that there is space in buffer now
        notify();
        return peek;
    }
}
