package day26collectionsiterators;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class Sets01 {
    public static void main(String[] args) {

        HashSet<Integer> hs = new HashSet<>();

        hs.add(12);
        hs.add(3);
        hs.add(14);
        hs.add(5);
        hs.add(32);
        hs.add(1);
        hs.add(45);
        hs.add(19);
        hs.add(null);

        System.out.println(hs);


        LinkedHashSet<Integer> lhs = new LinkedHashSet<>();

        lhs.add(12);
        lhs.add(3);
        lhs.add(14);
        lhs.add(5);
        lhs.add(32);
        lhs.add(1);
        lhs.add(45);
        lhs.add(19);
        lhs.add(null);

        System.out.println(lhs);


        LinkedHashSet<Integer> mylhs = new LinkedHashSet<>();

        mylhs.add(12);
        mylhs.add(30);
        mylhs.add(14);
        mylhs.add(50);
        mylhs.add(32);

        System.out.println(mylhs);
        lhs.retainAll(mylhs);

        System.out.println(lhs);


        TreeSet<Integer> ts = new TreeSet<>();

        ts.add(43);
        ts.add(2);
        ts.add(24);
        ts.add(-4);
        System.out.println(ts);

        //************************************************************************
        //1. way
        long t1 = System.nanoTime();
        TreeSet<String> ts1 = new TreeSet<>();
        ts1.add("abc");
        ts1.add("caf");
        ts1.add("acd");
        ts1.add("bcm");
        ts1.add("chi");
        ts1.add("jabc");
        ts1.add("kcaf");
        ts1.add("uacd");
        ts1.add("ebcm");
        ts1.add("xchi");
        System.out.println(ts1);
        long t2 = System.nanoTime();

        HashSet<String> hs1 = new HashSet<>();
        hs1.add("abc");
        hs1.add("caf");
        hs1.add("acd");
        hs1.add("bcm");
        hs1.add("chi");
        hs1.add("jabc");
        hs1.add("kcaf");
        hs1.add("uacd");
        hs1.add("ebcm");
        hs1.add("xchi");
        TreeSet<String> ts2 = new TreeSet<>(hs1);
        System.out.println(ts2);
        long t3 = System.nanoTime();

        long way1 = t2-t1;
        long way2 = t3-t2;
        System.out.println("time1 :"+way1);
        System.out.println("time2 :"+way2);

    }
}
