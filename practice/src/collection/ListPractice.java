package collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Stack;

public class ListPractice {
    public static void main(String[] args){
        // array have fixed size in java
//        int a[] = new int[5];

        //  is a resizable array
        // syntax to declare arraylist
       List<Integer> list = new ArrayList<>();

       list.add(10);
       list.add(20);
       list.add(30);

//        System.out.println(list);
//        System.out.println(list.size());
        System.out.println(list.get(0));
        list.set(1, 200);
        list.add(2, 2000);
        System.out.println(list);
        System.out.println(list.size());
//        list.add(5, 5000);
        System.out.println(list);

// Iterator
        Iterator<Integer> numList = list.iterator();
        while (numList.hasNext()){
            System.out.println("Iteretor :"+ numList.next());
        }


        Stack<String> name = new Stack<>();

        name.push("a");
        name.push("b");
        name.push("c");
        name.push("c");
        name.push("e");

        System.out.println(name);
        System.out.println(name.peek());









        List<String> stringListtype = new ArrayList<>();

//        stringListtype.add("rishi");
//        stringListtype.add("goyal");
//        System.out.println(stringListtype);

    }
}
