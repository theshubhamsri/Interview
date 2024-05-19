package Multithreading.ThreadLocal;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadLocalCleanupIfReusedExample {
    //If we don't cleanup the thread name we might get the same name because the thread will be reused by the thread pool
    //executor, so after the thread work is finished we need to remove the name
    public static void main(String[] args) {
        ThreadLocal<String> threadLocalObj = new ThreadLocal<>();
        ExecutorService poolObj = Executors.newFixedThreadPool( 2);
        poolObj.submit(() -> {
            threadLocalObj.set(Thread.currentThread().getName());
        });
        for(int i=1; i<15; i++){
            poolObj.submit(() -> {
                System.out.println(threadLocalObj.get());
            });
        }
    }
}
