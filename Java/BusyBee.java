import java.util.*;
import javafx.util.Pair;
public class BusyBee {
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        System.out.print("Enter n: ");
        int n=s.nextInt();
        int i,j;
        int arr[]=new int[n];
        //ArrayList<Pair<Integer,Integer>> res=new ArrayList<Pair<Integer,Integer>>();
        System.out.println("Enter array elements:");
        for( i=0;i<n;i++)
        {
            arr[i]=s.nextInt();
        }
        Arrays.sort(arr);
        System.out.print("Enter k: ");
        int k=s.nextInt();
        k=k*2;
        for(i=0;i<n;i++)
        {
            j=i+1;
            while(j<n)
            {
                if((arr[i]+arr[j])>=k)
                {
                    while(j<n)
                    {
                        //res.add(new Pair<Integer,Integer>(arr[i],arr[j]));
                        System.out.println("("+arr[i]+","+arr[j]+")");
                        j++;
                    }
                    break;
                }
                j++;
            }
        }
        // for(Pair<Integer,Integer> p:res)
        // {
        //     System.out.println("("+p.getKey()+","+p.getValue()+")");
        // }
    }
}
