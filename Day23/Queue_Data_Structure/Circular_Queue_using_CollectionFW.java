package day23;
import java.util.*;

public class Circular_Queue_using_CollectionFW {
    public static void main(String[] args) {
        //Queue q = new Queue();
        //Queue<Integer> q = new ArrayDequeue<>();
        Queue<Integer> q = new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);

        while(!q.isEmpty()){
            System.out.println(q.peek());
            q.remove();
        }
    }
}
