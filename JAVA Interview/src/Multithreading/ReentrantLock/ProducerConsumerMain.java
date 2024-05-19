package Multithreading.ReentrantLock;

public class ProducerConsumerMain {

    public static void main(String[] args) {
        ProducerConsumerProblem resource=new ProducerConsumerProblem(2);
        Thread t1=new Thread(()->{
            for(int i=0;i<=2;i++){
                resource.produce(i);
            }
        });

        Thread t2=new Thread(()->{
            for(int i=0;i<=2;i++){
                resource.consume();
            }
        });

        t1.start();
        t2.start();
    }

}
