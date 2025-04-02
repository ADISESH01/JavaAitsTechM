import java.util.*;
public class Frequency {
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter string: ");
        String str=s.next();
        HashMap<Character,Integer> hm=new HashMap<>();
        for(int i=0;i<str.length();i++)
        {
            char c=str.charAt(i);
            // if(hm.get(c)==null)
            // {
            //     hm.put(c,1);
            // }
            // else{
            //     hm.put(c,hm.get(c)+1);
            // }
            hm.compute(c,(key,value)->(value==null)? 1: value+1);
        }
        System.out.println(hm);
    }
}
        
