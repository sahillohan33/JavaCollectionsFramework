package collectionAndLists;
import java.util.PriorityQueue;
import java.util.Queue;

public class LearnPriorityQueue {
    public static void main(String[] args) {
  //      Queue<Integer> pq=new PriorityQueue<>();  // minimum number

        // maximum number
        Queue<Integer> pq=new PriorityQueue<>((a,b)->b-a);

        pq.add(2);
        pq.add(4);
        pq.add(5);
        pq.add(1);
        System.out.println(pq);
        System.out.println(pq.poll());
        System.out.println(pq);
    }
}

