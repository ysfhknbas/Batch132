package day14multidimarraylist;

import java.util.ArrayList;
import java.util.List;

public class ArrayList02 {
    public static void main(String[] args) {


        List<Integer> num = new ArrayList<>();

        num.add(5);
        num.add(9);
        num.add(3);
        num.add(4);
        num.add(6);
        int el =0;
        int el1 = num.size();

        for (int w:num)
        {
            el++;
        }
        for (int w:num)
        {

            if (w>el1)
            {
                System.out.print(w+" ");
            }
        }
    }
}
