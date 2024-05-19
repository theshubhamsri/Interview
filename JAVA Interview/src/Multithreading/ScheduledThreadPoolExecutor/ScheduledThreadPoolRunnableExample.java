package Multithreading.ScheduledThreadPoolExecutor;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class ScheduledThreadPoolRunnableExample {
//    Schedules a Runnable task after specific delay.
//    Only one time task runs.
    public static void main(String[] args) {
        ScheduledExecutorService poolObj= Executors.newScheduledThreadPool(5);

        poolObj.schedule(()->{
            System.out.println("Hello");
        },5, TimeUnit.SECONDS);
    }
}
