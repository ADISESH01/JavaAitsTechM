import java.util.*;
public class SetKthBit {
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int num=s.nextInt();
        int pos=s.nextInt();

        int res=num|(1<<pos);
        System.out.println(res);
        s.close();
    }
}
