import java.util.*;
public class LinearSearch {
    public static void main(String args[])
    {
        int i;
        Scanner s=new Scanner(System.in);
        System.out.print("Enter array size:");
        int size=s.nextInt();
        int arr[]=new int[size];
        System.out.println("Enter arry elements:");
        for(i=0;i<size;i++)
        {
            arr[i]=s.nextInt();
        }
        System.out.print("Enter search element:");
        int search=s.nextInt();
        for(i=0;i<size;i++)
        {
            if(arr[i]==search)
            {
                System.out.println("Element found at position "+(i+1));
                break;
            }
        }
        if(i==size)
        {
            System.out.println("Element not found");
        }
        s.close();
    }
}
