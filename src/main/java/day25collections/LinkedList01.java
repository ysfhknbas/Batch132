package day25collections;

import java.util.LinkedList;

public class LinkedList01 {
    public static void main(String[] args) {


        LinkedList<String> names = new LinkedList<>();

        names.add("Ali");
        names.addLast("Brad");
        names.add(2,"Jim");
        names.addLast("Brad");
        names.addFirst("Angie");
        names.addLast("Brad");
        names.add("Ali");

        System.out.println(names);
        names.remove();
        System.out.println(names);
        System.out.println(names.remove());
        int i = names.indexOf(names.remove());
        names.poll();


    }
}
