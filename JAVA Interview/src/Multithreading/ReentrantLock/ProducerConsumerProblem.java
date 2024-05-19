package Multithreading.ReentrantLock;

import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class ProducerConsumerProblem {
    Queue<Integer> sharedBuffer;
    int bufferSize;
    ReentrantLock lock=new ReentrantLock();
    Condition condition = lock.newCondition();
    public ProducerConsumerProblem(int bufferSize){
        this.bufferSize=bufferSize;
        sharedBuffer=new LinkedList<>();
    }

    public void produce(int item){
        try{
            lock.lock();
            System.out.println("Producer Lock acquired by thread: "+Thread.currentThread().getName());
            Thread.sleep(3000);
            while(sharedBuffer.size()==bufferSize){
                System.out.println("Producer thread is waiting");
                condition.await();
            }
            sharedBuffer.add(item);
            condition.signal();
        }
        catch (Exception e){

        }
        finally {
            System.out.println("Producer Lock released by the thread: "+Thread.currentThread().getName());
            lock.unlock();
        }
    }

    public void consume(){
        try{
            lock.lock();
            System.out.println("Consumer Lock acquired by thread: "+Thread.currentThread().getName());
            while(sharedBuffer.isEmpty()){
                System.out.println("Consumer thread is waiting");
                condition.await();
            }
            int peek=sharedBuffer.poll();
            System.out.println("Consumed peek: "+peek);
            condition.signal();
        }
        catch (Exception e){

        }
        finally {
            System.out.println("Consumer Lock released by: "+Thread.currentThread().getName());
            lock.unlock();

        }
    }
}
