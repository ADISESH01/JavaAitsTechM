import java.util.*;
public class ArrayListDemo {
    public static void main(String[] args)

    {
        List<Integer> list=new ArrayList<>();
        list.add(10);
        list.add(20);
        System.out.println("size: "+list.size());
        list.remove(1);
        System.out.println(list.get(0));
        for(int i:list)
        {
            System.out.print(i+" ");
        }
    }
}
