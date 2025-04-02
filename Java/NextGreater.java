import java.util.*;
public class NextGreater {
    public static void main(String[] args)
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
        ArrayList<Integer> res=new ArrayList<>();
        for(int i=0;i<size;i++)
        {
            res.add(-1);
        }
        for(int i=0;i<size-1;i++)
        {
            for(int j=i+1;j<size;j++)
            {
                if(arr[j]>arr[i])
                {
                    res.set(i,arr[j]);
                    break;
                }
            }
        }
        System.out.println(res);
    }
}
