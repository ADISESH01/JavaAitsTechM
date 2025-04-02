import java.util.*;
public class Power {
    static public long power(int b,int e)
    {
        if(e==0)
        {
            return 1;
        }
        return b*power(b,--e);
    }
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        System.out.println("enter base");
        int b=s.nextInt();
        System.out.print("Enter exponent: ");
        int e=s.nextInt();

        System.out.println(power(b,e));
    }
}
