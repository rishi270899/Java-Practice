package collection;

import java.util.ArrayDeque;

public class ArrayDequeExercise {
    static void main(String[] args) {
        ArrayDeque<Integer> dq = new ArrayDeque<>();
        dq.offer(10);
        dq.offer(20);
        dq.offer(30);
        System.out.println(dq);
        dq.offerFirst(50);
        dq.offerLast(100);
        System.out.println(dq);
        dq.push(55);
        System.out.println(dq);
        System.out.println(dq.peek());

    }
}
