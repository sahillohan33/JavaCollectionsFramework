package collectionAndLists;

import java.util.ArrayDeque;

public class StackAndQueueByArrayDequeue {
    public static void main(String[] args) {
        ArrayDeque<Integer> stack=new ArrayDeque<>();

        // stack

        stack.push(1);
        stack.push(2);
        stack.push(3);
        System.out.println(stack);
        System.out.println(stack.peek());
        System.out.println(stack.poll());
        System.out.println(stack);

        // queue

        ArrayDeque<Integer> q=new ArrayDeque<>();

        q.offer(10);
        q.offer(12);
        q.offer(14);
        q.offer(17);
        System.out.println(q);
        System.out.println(q.poll());
    }
}
