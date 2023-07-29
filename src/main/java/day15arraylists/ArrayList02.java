package day15arraylists;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayList02 {
    public static void main(String[] args) {

        List<Integer> num = new ArrayList<>();
        num.add(45);
        num.add(2);
        num.add(13);
        num.add(8);
        num.add(99);

        /*for (int i=0; i< num.size();i++)
        {
         if(num.get(i)<10)
         {
          num.set(i,77);
         }
        }
        System.out.println(num);*/


        for (int w:num)
        {
        if (w<10)
        {
         num.set(num.indexOf(w),77);
        }
        }
        System.out.println(num);

        //*****************************************************************

        List<Integer> nums = new ArrayList<>();
        nums.add(8);
        nums.add(2);
        nums.add(2);
        nums.add(8);
        nums.add(99);
        nums.add(2);
        System.out.println(nums);


        /*List<Integer> nodup = new ArrayList<>();

        for (int w: nums)
        {
        if(!nodup.contains(w))
        {
            nodup.add(w);
        }

        }
        System.out.println(nodup);*/

        for(int i=0; i< nums.size();i++)
        {
        Integer el = nums.get(i);

        if(nums.indexOf(el)!=nums.lastIndexOf(el))
        {
            nums.remove(el);
        i--;
        }
        }

        System.out.println(nums);


    }
}
