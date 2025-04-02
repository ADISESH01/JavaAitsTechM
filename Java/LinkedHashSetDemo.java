import java.util.*;
public class LinkedHashSetDemo {
    public static void main(String[] args)
    {
        Set<Integer> set=new LinkedHashSet<>();
        set.add(10);
        set.add(20);
        set.add(30);
        set.add(40);
        System.out.println(set);
        set.remove(20);
        System.out.println(set);
    }
}
