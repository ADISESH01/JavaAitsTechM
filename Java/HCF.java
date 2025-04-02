import java.util.*;

public class HCF {
    static public int hcf(int a,int b)
    {
        if(b%a==0)
        {
            return a;
        }
        return hcf(b%a ,a);
    }
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        System.out.println("enter a and b: ");
        int a=s.nextInt();
        int b=s.nextInt();

        System.out.println(hcf(Math.min(a,b),Math.max(a,b)));
    }

}
