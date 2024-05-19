package Multithreading.TypesOfThreadPoolExecutor;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CachedThreadPoolExecutorExample {
    public static void main(String[] args) {
        ExecutorService poolExecutor = Executors.newCachedThreadPool();
        poolExecutor.submit(() -> "this is the async task");
        poolExecutor.shutdown();
    }
}
