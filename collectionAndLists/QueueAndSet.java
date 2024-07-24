package collectionAndLists;

import java.util.LinkedList;
import java.util.Queue;

public class QueueAndSet {
    public static void main(String[] args) {
        Queue<Integer> queue=new LinkedList<>();
       // queue.add(2);
        // offer use karne hai
        queue.offer(2);
        queue.offer(1);
        queue.offer(4);
        queue.offer(6);

        System.out.println(queue);
        System.out.println(queue.poll());
        System.out.println(queue);
        System.out.println(queue.peek());
        System.out.println(queue);
        while(!queue.isEmpty()){
            System.out.println(queue.poll());
        }
        System.out.println(queue);


    }
}
