package day07ifstatandterneary;

import java.util.Scanner;

public class Ternary01 {
    public static void main(String[] args) {

        /*Scanner input= new Scanner(System.in);
        System.out.println("number ?");
        int num = input.nextInt();

        String r = num%2==0 ? "even" : "odd";
        System.out.println(r);*/


        Scanner input= new Scanner(System.in);
        System.out.println("number ?");
        int num = input.nextInt();
        num = Math.abs(num); // absolute value

        String r = num>99 && num<1000 ? "3 digits" : "not";
        System.out.println(r);

    }
}
