class MyThread extends Thread{
    MyThread(String name)
    {
        super(name);
    }
    @Override
    public void run() {
        System.out.println("In thread "+this.getName().toString());
    }
} 
public class ThreadDemo {
    public static void main(String[] args)
    {
        MyThread t1=new MyThread("Hello");
        MyThread t2=new MyThread("Bolo");

        t1.start();
        t2.start();
    }
}
