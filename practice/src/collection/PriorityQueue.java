package collection;

import java.util.Queue;

public class PriorityQueue {
    static void main(String[] args) {

        Queue<Integer> pq = new java.util.PriorityQueue<>();

        pq.add(30);
        pq.add(40);
        pq.add(10);
        pq.add(20);
        pq.offer(55);
        pq.add(60);

        System.out.println(pq);
        System.out.println(pq.poll());
        System.out.println(pq);
        System.out.println(pq.poll());
    }
}
