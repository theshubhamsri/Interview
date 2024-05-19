package Multithreading.ScheduledThreadPoolExecutor;

import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class ScheduledThreadPoolScheduledWithFixedDelay {

//    Schedules a Runnable task for repeated execution with a fixed delay
//    (Means next task delay counter start only after previous one task completed)
    public static void main(String[] args) {
        ScheduledExecutorService scheduledExecutorServiceObj = new ScheduledThreadPoolExecutor( 15);
        Future<?> scheduledObj= scheduledExecutorServiceObj.scheduleWithFixedDelay(() -> {
            System.out.println("task going to start by:"+ Thread.currentThread().getName());
            try {
                Thread.sleep(10000);
            }catch (Exception e){
            }
            System.out.println("New task");
        }, 5,  5, TimeUnit.SECONDS);
        try {
            Thread.sleep( 20000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        scheduledObj.cancel(true);
    }
}
