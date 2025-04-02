import java.util.*;
public class StackDemo {
    public static void main(String[] args)

    {
        Stack<Integer> stk=new Stack<>();
        stk.add(10);
        stk.add(20);
        stk.add(30);
        stk.add(40);
        stk.pop();
        System.out.println(stk);
        stk.size();
        stk.remove(0);
        stk.elementAt(1);
        stk.indexOf(20);
        System.out.println(stk);
    }
}
