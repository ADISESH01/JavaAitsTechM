import java.util.concurrent.*;
public class CtLatch {
    public static void main(String[] args)throws InterruptedException,IllegalMonitorStateException
    {
        CountDownLatch latch=new CountDownLatch(3);
        Runnable worker=()->{
            System.out.println(Thread.currentThread().getName()+" worker started");
            try{
                Thread.sleep(2000);
                latch.countDown();
            }
            catch(InterruptedException e)
            {
                e.printStackTrace();
            }
            
        };
        for(int i=0;i<5;i++)
            {
                new Thread(worker).start();
            }
            latch.await();
            System.out.println("All threads completed");
    }
}
