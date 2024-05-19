package Multithreading.CompletableFuture;

import java.util.concurrent.*;

public class ThenApplyAndThenApplyAsync {

//    thenApply & thenApplyAsync
//    - Apply a function to the result of previous Async computation.
//        - Return a new Completable Future object.

//    'thenApply' method:
//    Its a Synchronous execution.
//    Means, it uses same thread which completed the previous Async task.
//            'thenApplyAsync' method:
//    Its a Asynchronous execution.
//    Means, it uses different thread (from 'fork-join' pool, if we do not provide the executor in the method), to complete this function.
//    If Multiple 'thenApplyAsync' is used, ordering can not be guarantee, they will run concurrently.
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ThreadPoolExecutor poolExecutor = new ThreadPoolExecutor (1,  1,1,
                TimeUnit.HOURS, new ArrayBlockingQueue<>(10),
        Executors.defaultThreadFactory(), new ThreadPoolExecutor. AbortPolicy());

        CompletableFuture<String> asyncTask1 = CompletableFuture.supplyAsync(() -> {
//Task which thread need to execute
            return "Concept and ";
        }, poolExecutor).thenApply ((String val) -> {
//functionality which can work on the result of previous async task
            return val + "Coding";
        });


        System.out.println(asyncTask1.get());



        CompletableFuture<String> asyncTask2 =CompletableFuture.supplyAsync(() -> {
            System.out.println("Thread Name which runs 'supplyAsync:"+ Thread.currentThread().getName());
            return "Concept and";}
, poolExecutor).thenApplyAsync((String val) -> {
                System.out.println("Thread Name which runs 'thenApply':" +Thread.currentThread().getName());
                return val + "Coding";
            });
            System.out.println("Thread Name for after CF': "+Thread.currentThread().getName());
          System.out.println(asyncTask2.get());

        poolExecutor.shutdown();
    }
}
