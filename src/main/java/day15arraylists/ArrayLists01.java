package day15arraylists;

import java.util.ArrayList;
import java.util.List;

public class ArrayLists01 {
    public static void main(String[] args) {

        List<String> liste = new ArrayList<>();
        liste.add("Kris");
        liste.add("tony");
        liste.add("alex");
        liste.add("tom");
        liste.add("ali");
        liste.add("tony");
        System.out.println(liste);

        liste.remove("tony");
        System.out.println(liste);

        liste.remove(3);
        System.out.println(liste);


        List<Integer> num = new ArrayList<>();
        num.add(5);
        num.add(54);
        num.add(87);
        num.add(2);
        num.add(-7);

        System.out.println(num);

        num.remove((Integer) 54);
        System.out.println(num);



        List<String> listem = new ArrayList<>();
        listem.add("Kris");
        listem.add("toony");
        listem.add("aleex");
        listem.add("tom");
        listem.add("ali");

        for(int i=0; i<listem.size();i++)
        {
        if(listem.get(i).length()<5)
        {
         listem.remove(i);
         i--;
        }
        }
        System.out.println(listem);


    }
}
