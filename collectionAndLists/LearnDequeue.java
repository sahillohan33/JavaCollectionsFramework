package collectionAndLists;

import java.util.ArrayDeque;

public class LearnDequeue {
    public static void main(String[] args) {
        ArrayDeque<Integer> dq=new ArrayDeque<>();
        dq.offer(12);
        dq.offerLast(19);
        dq.offerFirst(13);
        System.out.println(dq);

        System.out.println(dq.poll());
        System.out.println(dq.pollLast());
        System.out.println(dq);

    }
}
