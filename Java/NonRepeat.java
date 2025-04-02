import java.util.*;
public class NonRepeat {
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        System.out.print("Enter size: ");
        int size=s.nextInt();
        int arr[]=new int[size];
        System.out.println("Enter array elemants: ");
        for(int i=0;i<size;i++)
        {
            arr[i]=s.nextInt();
        }
        HashSet<Integer> hs=new HashSet<>();
        for(int a:arr)
        {
            hs.add(a);
        }
        for(int a:hs)
        {
            System.out.print(a+" ");
        }
    }
}
