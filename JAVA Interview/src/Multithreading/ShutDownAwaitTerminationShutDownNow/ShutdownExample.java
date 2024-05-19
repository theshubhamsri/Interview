package Multithreading.ShutDownAwaitTerminationShutDownNow;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ShutdownExample {
//    Shutdown:
//            • Initiates orderly shutdown of the ExecutorService.
//            • After calling 'Shutdown', Executor will not accept new task submission.
//            • Already Submitted tasks, will continue to execute.
    public static void main(String[] args) {
        ExecutorService poolObj = Executors.newFixedThreadPool( 5);
        poolObj.submit(() -> {
            System.out.println("Thread going to start its work");
        });
        poolObj.shutdown();
        poolObj.submit(() -> {
            System.out.println("Thread going to start its work");
        });
    }
}
