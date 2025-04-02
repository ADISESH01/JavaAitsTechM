import java.util.*;
public class RotateArray {
    public static int  arr[];

    public static void reverse(int st,int end)
    {
        for(int i=st,j=end-1;i<j;i++,j--)
        {
            int t=arr[i];
            arr[i]=arr[j];
            arr[j]=t;
        }
    }
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter size: ");
        int size=s.nextInt();
        arr=new int[size];
        System.out.println("Enter array elements: ");
        for(int i=0;i<size;i++)
        {
            arr[i]=s.nextInt();
        }
        System.out.println("Enter number of items to be rotated: ");
        int n=s.nextInt();
        reverse(0,n);
        reverse(n,size);
        reverse(0,size);

        for(int a:arr)
        {
            System.out.print(a+" ");
        }
    }
}
