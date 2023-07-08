package day07ifstatandterneary;

import java.util.Scanner;

public class IfStat {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter gender and age");
        String g = input.next();
        int a = input.nextInt();

        if(g.equalsIgnoreCase("male"))
        {
            if(a<66)
            {
                System.out.println("work");
            }
            else
            {
                System.out.println("retire");
            }
        }
        else if(g.equalsIgnoreCase("female"))
        {
            if(a<61)
            {
                System.out.println("work");
            }
            else
            {
                System.out.println("retire");
            }
        }
        else
        {
            System.out.println("undefined");
        }
    }
}
