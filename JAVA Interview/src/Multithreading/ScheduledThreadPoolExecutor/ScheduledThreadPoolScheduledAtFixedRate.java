package Multithreading.ScheduledThreadPoolExecutor;

import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class ScheduledThreadPoolScheduledAtFixedRate {
//    Schedules a Runnable task for repeated execution with fixed rate.
//    We can use cancel method to stop this repeated task.
//    Also lets say, if thread1 is taking too much time to complete the task and next task is ready to run,
//    till previous task will not get completed, new task can not be start (it will wait in queue).
    public static void main(String[] args) {
        ScheduledExecutorService scheduledExecutorServiceObj = new ScheduledThreadPoolExecutor( 15);
        Future<?> scheduledObj= scheduledExecutorServiceObj.scheduleAtFixedRate(() -> {
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
