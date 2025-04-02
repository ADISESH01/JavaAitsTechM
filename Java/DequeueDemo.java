import java.util.*;
public class DequeueDemo {
    public static void main(String[] args)
    {
        ArrayDeque<Integer> q=new ArrayDeque<>();
        q.add(10);
        q.offer(20);
        q.addFirst(30);
        q.addLast(40);
        System.out.println(q);
        q.removeFirst();
        q.removeLast();
        q.offerFirst(10);
        q.offerLast(30);
        q.peekFirst();
        q.peekLast();
        q.pollFirst();
        q.pollLast();
        System.out.println(q);
    }
}
