package Multithreading.CompletableFuture;

import java.util.concurrent.*;

public class ThenComposeAndThenComposeAsync {
//    Chain together dependent Async operations.
//    Means when next Async operation depends on the result of the previous Async one. We can tied them together.
//    For async tasks, we can bring some Ordering using this.
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ThreadPoolExecutor poolExecutor = new ThreadPoolExecutor(1, 1, 1,
                TimeUnit.HOURS, new ArrayBlockingQueue<>(10),
                Executors.defaultThreadFactory(), new ThreadPoolExecutor.AbortPolicy());
        CompletableFuture<String> asyncTask1 =CompletableFuture
                .supplyAsync(() -> {
                    System.out.println("Thread Name which runs 'supplyAsync':" + Thread.currentThread().getName());
                    return "Concept and ";
                }, poolExecutor)
                .thenCompose ((String val) -> {
                    return CompletableFuture.supplyAsync(() -> {
                        System.out.println("Thread Name which runs 'thenCompose': "+ Thread.currentThread().getName());
                        return val + "Coding";
                    });
                });
        System.out.println(asyncTask1.get());
    }
}
