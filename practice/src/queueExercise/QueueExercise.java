package queueExercise;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExercise {
    public static void main(String[] args){
        Queue<String> queueCustomer = new LinkedList<>();
        queueCustomer.add("1234");
        queueCustomer.add("4567");
        queueCustomer.add("5429");
        queueCustomer.add("1019");

        while (!queueCustomer.isEmpty()){
            System.out.println("Customer " + queueCustomer.poll() + " is getting helped");
        }
    }
}
