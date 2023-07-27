package day14multidimarraylist;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class ArrayLists01 {
    public static void main(String[] args) {


        ArrayList<Integer> ages = new ArrayList<>();
        List<Integer> prices = new ArrayList<>();


        ages.add(5);
        System.out.println(ages);

        ages.add(8);
        System.out.println(ages);

        ages.add(1,45);
        System.out.println(ages);



        prices.add(89);
        prices.add(78);
        prices.add(213);

        ages.addAll(prices);
        ages.addAll(2,prices);

        System.out.println(ages);

        boolean r = ages.contains(79);
        System.out.println(r);


        List<String> names1 = new ArrayList<>();
        names1.add("tom");
        names1.add("mork");
        names1.add("xukt");
        names1.add("3");

        List<String> names2 = new ArrayList<>();
        names2.add("3");
        names2.add("tom");
        names2.add("mork");
        names2.add("xukt");

        Collections.sort(names1);
        Collections.sort(names2);


    }



}
