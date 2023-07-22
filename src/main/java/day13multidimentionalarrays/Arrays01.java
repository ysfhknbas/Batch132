package day13multidimentionalarrays;

import java.util.Arrays;

public class Arrays01 {
    public static void main(String[] args) {
        int num[] = new int[4];
        num[0]=6;
        num[1]= 13;
        num[2] = 2;
        num[3]= 25;

        //1. way
        for (int w: num)
        {
        if(w<10)
        {
            System.out.print(w+" ");
        }
        }
        // 2. way

        Arrays.sort(num);
        for (int w: num)
        {
            if(w>=10)
            {
                break;
            }
            else
            {
                System.out.print(w+" ");
            }
        }
    }
}
