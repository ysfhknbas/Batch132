package day03nonprimivitesscannerclass;

import java.util.Scanner;

public class Scanner01 {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);

        System.out.println("first number ?");
        int f = input.nextInt();
        System.out.println("second number ?");
        int s= input.nextInt();
        System.out.println(f+s);
    }
}
