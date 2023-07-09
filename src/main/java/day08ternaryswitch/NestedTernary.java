package day08ternaryswitch;

import java.util.Scanner;

public class NestedTernary {

    public static void main(String[] args) {

        // leap year

        Scanner input = new Scanner(System.in);
        System.out.println("year ?");
        int a= input.nextInt();

        String r = a%100==0 ? ( a%400==0 ? "leap": "not") : (a%4==0 ? "leap":"not");
        System.out.println(r);


    }

}
