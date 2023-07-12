package day08ternaryswitch;

import java.util.Scanner;

public class Ternary01 {
    public static void main(String[] args) {

        // select the minimum
        /*Scanner input = new Scanner(System.in);
        System.out.println("type 2 numbers");
        int a=input.nextInt();
        int b= input.nextInt();

        int min = a<b ? a : b;
        System.out.println(min);*/


        //absolute value
        /*Scanner input = new Scanner(System.in);
        System.out.println("type a numbers");
        int a=input.nextInt();
        int abs= a<0 ? -a : a;
        System.out.println(abs);*/

        //Object data type

        int a= 5, b=-8;

        Object r = a>0 && b>0 ? a*b : "dont know";
        System.out.println(r);


    }
}
