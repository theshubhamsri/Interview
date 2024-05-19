package Multithreading.CompletableFuture;

import java.util.concurrent.*;

public class ThenCombineAndThenCombineAsync {
    //Used to combine the result of 2 Comparable Future.
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ThreadPoolExecutor poolExecutor = new ThreadPoolExecutor (1,  1,1,
                TimeUnit.HOURS, new ArrayBlockingQueue<>(10),
                Executors.defaultThreadFactory(), new ThreadPoolExecutor. AbortPolicy());
        CompletableFuture<Integer> asyncTask1= CompletableFuture
                .supplyAsync(() -> {
                    return 16;
                }, poolExecutor);
        CompletableFuture<String> asyncTask2= CompletableFuture
                .supplyAsync(() -> {
                    return "k";
                }, poolExecutor);
        CompletableFuture<String> combinedFutureObj = asyncTask1.thenCombine(asyncTask2, (Integer val1, String val2) -> val1 + val2);
        System.out.println(combinedFutureObj.get());
        poolExecutor.shutdown();
    }
}
