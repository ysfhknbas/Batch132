package day14multidimarraylist;

import java.util.Arrays;

public class Md01 {
    public static void main(String[] args) {


        int arr[][] = {{5,3},{9,8,7}};
        int sum =0;
        for (int[] w:arr)
        {
            sum=sum+w.length;
        }

        int[] b= new int[sum];
        int idx=0;
        for (int[] w:arr)
        {
            for (int x:w)
            {
                b[idx]=x;
                idx++;
            }
        }
        System.out.println(Arrays.toString(b));


         }
}
