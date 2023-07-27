package day13multidimentionalarrays;

import java.util.Arrays;

public class Md01 {
    public static void main(String[] args) {

        int arr[][] = new int[4][2];
        System.out.println(Arrays.deepToString(arr));

        arr[0][0]=3;
        arr[0][1]=10;
        arr[1][0]=61;
        arr[1][1]=5;
        arr[2][0]=2;
        arr[2][1]=11;
        arr[3][0]=81;
        arr[3][1]=23;

        System.out.println(Arrays.deepToString(arr));
        System.out.println(Arrays.toString(arr[0]));
        System.out.println(arr[0][1]);


        int brr[][] ={{5,34},{12, 98, -5}};
        int sum =0;
        for (int[] w:brr)
        {
            for (int u: w)
            {
            sum = sum +u;
            }
        }

        System.out.println(sum);


    }
}
