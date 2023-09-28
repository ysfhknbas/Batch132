package day26collectionsiterators;

import java.util.Deque;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class Queue01 {
    public static void main(String[] args) {

        Queue<String> que = new LinkedList<>();
        que.add("Tom");
        que.add("Joe");
        que.add("Ali");
        que.add("Mor");
        System.out.println(que);

        Queue<String> myQue = new PriorityQueue<>();
        myQue.add("Tom");
        myQue.add("Joe");
        myQue.add("Ali");
        myQue.add("Mor");
        System.out.println(myQue);

        Deque<String> dq = new LinkedList<>();
        dq.add("Tom");
        dq.add("Joe");
        dq.add("Ali");
        dq.add("Mor");
        System.out.println(dq);

    }
}
