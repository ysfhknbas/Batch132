package day10forloopwhileloop;

import java.util.Scanner;

public class NestedFoorLoop01 {
    public static void main(String[] args) {


for(int i=1; i<4;i++)
{
    String week ="Week: "+i;
    System.out.println(week);
    for(int j=1;j<4;j++)
    {
        String day = "Day: "+j;
        System.out.println(day);
    }
}


        Scanner input =new Scanner(System.in);
        System.out.println("enter row");
        int row =input.nextInt();
        System.out.println("enter column");
        int column=input.nextInt();


        for(int j=1;j<=row;j++)
        {
            for (int i = 1; i <= column; i++)
            {
                System.out.print("*");
            }
            System.out.println();
        }







    }
}
