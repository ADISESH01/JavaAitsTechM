import java.util.concurrent.*;
public class CallDemo {
    public static void main(String[] args)throws ExecutionException,InterruptedException{
        ExecutorService executor=Executors.newSingleThreadExecutor();
        Callable<Integer> task=()->{
            Thread.sleep(2000);
            return 10*10;
        };
        Future<Integer> future=executor.submit(task);
        System.out.println("Doing the task");
        Integer res=future.get();
        System.out.println("Result: "+res);
        executor.shutdown();
    }
}
