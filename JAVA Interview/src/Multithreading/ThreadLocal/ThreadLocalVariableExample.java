package Multithreading.ThreadLocal;

public class ThreadLocalVariableExample {
    public static void main(String[] args) {
        ThreadLocal<String> threadLocalObj = new ThreadLocal<>();
        //main thread
        threadLocalObj.set(Thread.currentThread().getName());
        Thread thread1 =new Thread( () -> {
            threadLocalObj.set(Thread.currentThread().getName());
            System.out.println("Task1");
        });
        thread1.start();
        try {
            Thread.sleep(2000);
        }
        catch (Exception e){
            }
            //here we have main thread
            System.out.println("Main thread:"+ threadLocalObj.get());
    }
}
