package day14multidimarraylist;

public class Md03 {
    public static void main(String[] args) {

        int arr[][]={{5,4},{-10,6,3}};

        int sum =0;
        int small =arr[0][0];
        int big =arr[0][0];
        for (int[] w:arr)
        {
            for (int x:w)
            {
            small = Math.min(small,x);
            big =Math.max(big,x);
            }
        }
        sum =small+big;
        System.out.println(sum);


    }
}
