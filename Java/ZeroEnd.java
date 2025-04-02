import java.util.*;
public class ZeroEnd {
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        System.out.print("Enter size: ");
        int size=s.nextInt();
        int arr[]=new int[size];
        System.out.println("Enter array elements:");
        for(int i=0;i<size;i++)
        {
            arr[i]=s.nextInt();
        }
        int res[]=new int[size];
        int j=0;
        for(int i=0;i<size;i++)
        {
            if(arr[i]!=0)
            {
                res[j]=arr[i];
                j++;
            }
        }
        for(;j<size;j++)
        {
            res[j]=0;
        }
        for(int a:res)
        {
            System.out.print(a+" ");
        }
    }
}
