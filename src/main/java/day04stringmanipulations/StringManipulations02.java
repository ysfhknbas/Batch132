package day04stringmanipulations;

import java.util.Scanner;

public class StringManipulations02 {
    public static void main(String[] args) {

        //get first 4 characters of a string and make them lower case

      /*  Scanner input = new Scanner(System.in);
        System.out.println("enter String");
        String full = input.nextLine();
        String f4 = full.substring(0,4).toLowerCase();

        System.out.println(f4);*/


        String s ="Java";
        String n =new String("Java");

        boolean d = s==n;
        System.out.println(d);

       boolean same = s.equals(n);
        System.out.println(same);

    }
}
