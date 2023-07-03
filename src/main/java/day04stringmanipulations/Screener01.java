package day04stringmanipulations;

import java.util.Scanner;

public class Screener01 {
    public static void main(String[] args) {

    //getting initials of a name contains first name and last name

        Scanner input = new Scanner(System.in);
        System.out.println("Enter your first and last name");
        String full = input.nextLine();
       // int spc = full.indexOf(" ");
       // System.out.println(spc);
        String ilk =full.split(" ")[0];
        String iki = full.split(" ")[1];
        System.out.println(""+ilk.charAt(0)+iki.charAt(0));

    }
}
