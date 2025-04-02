import java.util.*;
public class Park {
    public static void main(String[] args)
    {
        int n;
        Scanner s=new Scanner(System.in);
        System.out.println("enter n:");
        n=s.nextInt();
        char arr[]=new char[n];
        System.out.println("Enter array:");
        for(int i=0;i<n;i++)
        {
            arr[i]=s.next().charAt(0);
        }
        int c=0,max=0;
        for(int i=0;i<n;i++)
        {
            if(arr[i]=='S')
            {
                c++;
            }
            else{
                if(c>max)
                {
                    max=c;
                    c=0;
                }
            }
        }
        System.out.println(max);
    }
}
