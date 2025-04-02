import java.util.*;
public class Factorial {
    static public long fact(int n)
    {
        if(n==0 || n==1 )
        {
            return 1;
        }
        return n*fact(n-1);
    }
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        System.out.print("Enter a number:");
        int num=s.nextInt();

        System.out.println("Factorial is: "+fact(num));
    }
}
