import java.util.concurrent.Executors;
import java.util.concurrent.ExecutorService;
public class ExeServideDemo {
    public static void main(String[] args)
    {
        ExecutorService executor=Executors.newFixedThreadPool(3);
        Runnable task=()->{
            System.out.println(Thread.currentThread().getName()+" is executing");
        };
        for(int i=0;i<5;i++)
        {
            executor.submit(task);
        }
    }
}
