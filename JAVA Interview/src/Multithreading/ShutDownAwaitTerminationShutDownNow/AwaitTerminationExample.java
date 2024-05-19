package Multithreading.ShutDownAwaitTerminationShutDownNow;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class AwaitTerminationExample {
//    AwaitTermination:
//            • Its an Optional functionality. Return true/false.
//            • It is used after calling 'Shutdown' method.
//            • Blocks calling thread for specific timeout period, and wait for ExecutorService shutdown.
//            • Return true, if ExecutorService gets shutdown withing specific timeout else false
    public static void main(String[] args) {
        ExecutorService poolExecutorObj = Executors.newFixedThreadPool( 5);
        poolExecutorObj.submit(() -> {
            try {
                Thread.sleep( 6000);
            } catch (Exception e) {
            }
            System.out.println("new task");
        });
        poolExecutorObj.shutdown();
        try {
            boolean isExecutorTerminated =poolExecutorObj.awaitTermination( 3, TimeUnit.SECONDS);
            System.out.println("Main thread, isExecutor Terminated:" + isExecutorTerminated);
        } catch (Exception e) {
        }
    }
}
