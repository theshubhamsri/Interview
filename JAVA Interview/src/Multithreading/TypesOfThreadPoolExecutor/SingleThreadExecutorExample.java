package Multithreading.TypesOfThreadPoolExecutor;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class SingleThreadExecutorExample {
    public static void main(String[] args) {
        ExecutorService poolExecutor1 = Executors.newSingleThreadExecutor();
        poolExecutor1.submit(() -> "this is the async task");
        poolExecutor1.shutdown();
    }
}
