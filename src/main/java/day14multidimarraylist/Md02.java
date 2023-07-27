package day14multidimarraylist;

public class Md02 {
    public static void main(String[] args) {

        int arr[][]={{5,4},{10,6,3}};

        int res=1;
        for (int[] w:arr)
        {
            for (int x:w)
            {
            res=res*x;
            }
        }
        System.out.println(res);
    }
}
