package day16arraylists;

import java.util.ArrayList;
import java.util.List;

public class ArrayList02 {
    public static void main(String[] args) {

        List<Integer> salary = new ArrayList<>();
        salary.add(4500);
        salary.add(6400);
        salary.add(2300);
        salary.add(5000);
        salary.add(7150);
        List<Integer> upsalary = new ArrayList<>();

        for (Integer w:salary)
        {
            if(w<5000)
            {
            upsalary.add(w+(w/10));
            }
            else upsalary.add(w);
        }
        System.out.println(upsalary);
    }
}
