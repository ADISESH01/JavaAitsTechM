import java.util.*;

public class Prime {
    static boolean isPrime(int n)
{
    for(int i=2;i<n;i++)
    {
        if((n%i)==0)
        {
            return false;
        }
    }
    return true;
}
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter n:");
        int n=s.nextInt();
        int c=0;
        for(int i=3;i<=n;i++)
        {
            if(isPrime(i))
            {
                int sum=0;
                for(int j=2;j<i;j++)
                {
                    if(isPrime(j)){
                    if(sum<i)
                    {
                        sum+=j;
                    }
                    if(sum==i)
                    {
                        c++;
                        break;
                    }
                }
                }
            }
        }
        System.out.println(c);
    }
}
