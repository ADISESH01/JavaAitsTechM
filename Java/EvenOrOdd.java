import java.util.*;
public class EvenOrOdd {
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter a number:");
        int num=s.nextInt();

        if((num&Integer.MAX_VALUE)==num)
        {
            System.out.println(num+" is odd");
        }
        else{
            System.out.println(num+" is even");
        }
        s.close();
    }
}
