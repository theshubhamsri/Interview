package Multithreading.ReadWriteLock;

import java.util.concurrent.locks.ReadWriteLock;

public class SharedResource {
    boolean isAvailable=false;
    public void producer(ReadWriteLock lock){
        try{
            //More than one thread can acquire read lock
            lock.readLock().lock();
            System.out.println("Read Lock acquired by Thread: "+Thread.currentThread().getName());
            isAvailable=true;
            Thread.sleep(8000);
        }
        catch(Exception e){

        }
        finally{
            lock.readLock().unlock();
            System.out.println("Read Lock released by thread: "+Thread.currentThread().getName());
        }
    }

    public void consume(ReadWriteLock lock){
        try{
            // Write lock only one thread can acquire write lock
            lock.writeLock().lock();
            System.out.println("Write Lock acquired by thread: "+Thread.currentThread().getName());
            isAvailable=false;
        } catch (Exception e) {
            e.printStackTrace();
        }
        finally {
            lock.writeLock().unlock();
            System.out.println("Write Lock released by the thread: "+Thread.currentThread().getName());
        }

    }
}
