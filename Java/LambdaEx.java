interface MyInterface
{
    void show(int a, int b);
}
public class LambdaEx {
    public static void main(String[] args)
    {
        MyInterface m=(int a,int b)->System.out.println("Sum is: "+(a+b));
        m.show(10,20);
    }
}
