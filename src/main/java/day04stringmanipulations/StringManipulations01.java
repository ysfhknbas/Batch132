package day04stringmanipulations;

import java.util.Scanner;

public class StringManipulations01 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("enter full name");
        String full = input.nextLine();
        String upfull = full.toUpperCase();
        System.out.println(full);
        System.out.println(upfull);



        System.out.println("enter full name");
        String full1 = input.nextLine();
        System.out.println(full1);
        String nospace = full1.trim();
        System.out.println(nospace);
        int l = nospace.length();
        System.out.println(l);



    }
}
