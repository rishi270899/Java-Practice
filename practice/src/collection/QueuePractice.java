package collection;

import java.util.LinkedList;
import java.util.Queue;

public class QueuePractice {
    public static void main(String[] args){

        Queue<Integer> queue = new LinkedList<>();

        //queue.add(10);
//        queue.add(10);
//        queue.add(10);
//        queue.add(10);

        queue.offer(10);
        queue.offer(20);
        queue.offer(30);
        queue.offer(40);
        queue.offer(50);


        while (!queue.isEmpty()){
            System.out.println(queue.poll());
        }

        System.out.println(queue);
        System.out.println(queue.poll());
        System.out.println(queue);
        System.out.println(queue.poll());
        System.out.println(queue);
        System.out.println(queue.peek());



    }
}
