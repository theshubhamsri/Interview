package Multithreading.WorkStealingPoolExecutor;

import java.util.concurrent.RecursiveTask;
//Fork-Join Pool
public class ComputeSumTask extends RecursiveTask<Integer> {
    int start;
    int end;
    ComputeSumTask(int start,int end){
        this.start=start;
        this.end=end;
    }
    @Override
    protected Integer compute() {
        if (end-start <= 4) {
            int totalSum = 0;
            for
            (int i= start; i <= end; i++) {
                totalSum += 1;
            }
            return totalSum;
        } else {
                //split the task
            int mid =(start + end) / 2;
            ComputeSumTask leftTask = new ComputeSumTask(start, mid);
            ComputeSumTask rightTask = new ComputeSumTask(mid + 1, end);

            // Fork the subtasks for parallel execution; //One subtask will be picked by the thread and the other will be added in the work stealing queue of the thread working
            //If a thread is idle it can steal the task from the work stealing queue of the other thread

            leftTask.fork();
            rightTask.fork();
            // Combine the results of subtasks
            int leftResult = leftTask.join();
            int rightResult= rightTask.join();
            // Combine the results
            return leftResult + rightResult;
        }
    }
}
