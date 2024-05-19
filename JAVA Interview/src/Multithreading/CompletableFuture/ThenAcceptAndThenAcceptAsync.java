package Multithreading.CompletableFuture;

import java.util.concurrent.*;

public class ThenAcceptAndThenAcceptAsync {
    //- Generally end stage, in the chain of Async operations - It does not return anything.
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ThreadPoolExecutor poolExecutor = new ThreadPoolExecutor(1, 1, 1,
                TimeUnit.HOURS, new ArrayBlockingQueue<>(10),
                Executors.defaultThreadFactory(), new ThreadPoolExecutor.AbortPolicy());
        CompletableFuture<Void> asyncTask1 =CompletableFuture
                .supplyAsync(() -> {
                    System.out.println("Thread Name which runs 'supplyAsync': "+ Thread.currentThread().getName());
                    return "Concept and ";
                }, poolExecutor)
                .thenAccept((String val) -> System.out.println("All stages completed"));
        System.out.println(asyncTask1.get());
    }
}
