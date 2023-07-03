package day04stringmanipulations;

public class interviewquestion01 {
    public static void main(String[] args) {

        //Type to swap the integers i)  a=12 b=5   ii) a=5 b=12

    int a= 12, b=5;
    int temp;

    temp = a;
    a=b;
    b=temp;

        System.out.println(a+" , "+b);

        // ***
     int x=4 , y=7;

     x=x+y;
     y=x-y;
     x=x-y;

        System.out.println(x+ " , "+y);

    }
}
