package Multithreading.ThreadPoolExecutor;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;

public class ThreadPoolExecutor {
    public static void main(String[] args) {

        java.util.concurrent.ThreadPoolExecutor poolExecutor=new java.util.concurrent.ThreadPoolExecutor(2,5,1, TimeUnit.HOURS,
                new ArrayBlockingQueue<>(10),new CustomThreadFactory(),new CustomRejectHandler());
        poolExecutor.allowCoreThreadTimeOut(true);
        for(int i=0;i<25;i++){
            poolExecutor.submit(()->{
                try{
                    Thread.sleep(5000);
                    System.out.println("Thread Name: "+Thread.currentThread().getName());
                }
                catch(Exception e){

                }
            });
        }

        poolExecutor.shutdown();
    }

    static class CustomThreadFactory implements ThreadFactory {

        @Override
        public Thread newThread(Runnable r) {
            Thread th=new Thread(r);
            th.setPriority(Thread.NORM_PRIORITY);
            th.setDaemon(false);
            return th;
        }
    }

    static class CustomRejectHandler implements RejectedExecutionHandler{

        @Override
        public void rejectedExecution(Runnable r, java.util.concurrent.ThreadPoolExecutor executor) {
            System.out.println("Task Denied"+r.toString());
        }
    }
}
