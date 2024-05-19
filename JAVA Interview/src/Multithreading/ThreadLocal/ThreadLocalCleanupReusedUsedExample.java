package Multithreading.ThreadLocal;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadLocalCleanupReusedUsedExample {
    public static void main(String[] args) {
        ThreadLocal<String> threadLocalObj = new ThreadLocal<>();
        ExecutorService poolObj = Executors.newFixedThreadPool( 5);
        poolObj.submit(() -> {
            threadLocalObj.set(Thread.currentThread().getName());
            //my work completed, now clean up
            threadLocalObj.remove();
        });
        for(int i=1; i<15; i++){
            poolObj.submit(() -> {
                System.out.println(threadLocalObj.get());
            });
        }
    }
}
