package day18varargsstringbuilderbuffer;

public class Varargs01 {

    public static void main(String[] args) {
        int r=add(4,5,6);
        System.out.println(r);
    }

    public static int add(int... v)
    {
    int sum=0;
        for (int w:v)
        {
        sum=sum+w;
        }
        return sum;
    }

}
