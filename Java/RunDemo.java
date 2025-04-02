class MyRunnable implements Runnable{
    
    public void run()
    {
        System.out.println("in thread");
    }
}
public class RunDemo {
    public static void main(String[] ar)
    {
        MyRunnable t1=new MyRunnable();
        Thread t=new Thread(t1);
        t.start();
    }
}
