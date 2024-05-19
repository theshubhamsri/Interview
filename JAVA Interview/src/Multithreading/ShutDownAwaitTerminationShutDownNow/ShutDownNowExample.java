package Multithreading.ShutDownAwaitTerminationShutDownNow;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class ShutDownNowExample {
//    shutdown Now:
// • Best effort attempt to stop/interrupt the actively executing tasks
//• Halt the processing of tasks which are waiting
//• Return the list of tasks which are awaiting execution.
    public static void main(String[] args) {
        ExecutorService poolExecutorObj = Executors.newFixedThreadPool( 5);
        poolExecutorObj.submit(() -> {
            try {
                Thread.sleep( 6000);
            } catch (Exception e) {
            }
            System.out.println("new task");
        });
        poolExecutorObj.shutdownNow();
        try {
            boolean isExecutorTerminated =poolExecutorObj.awaitTermination( 3, TimeUnit.SECONDS);
            System.out.println("Main thread, isExecutor Terminated:" + isExecutorTerminated);
        } catch (Exception e) {
        }
    }
}
