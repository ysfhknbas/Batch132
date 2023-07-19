package day11nestedforloopwhileloop;

import java.util.Scanner;

public class WhileLoop01 {
    public static void main(String[] args) {

        int i=4;
        while (i<8)
        {
            System.out.print(i+ ", ");
            i++;
        }
        System.out.println();
        //****************************************************
        int j=12;
        while (j<68)
        {
            if(j%2!=0)
            {
                System.out.print(j+" ");
            }
            j++;
        }
        System.out.println();
        //****************************************************

        int k=12;
        int sum=0;

        while (k<15)
        {
         sum=sum+k;
         k++;
        }
        System.out.println(sum);
        System.out.println();
        //****************************************************

        Scanner input = new Scanner(System.in);
        System.out.println("enter a number");
        int num =input.nextInt();
        int summ =0;

        while (num>0)
        {
        summ = summ + num%10;
        num =num/10;
        }
        System.out.println(summ);
        System.out.println();
        //****************************************************
        System.out.println("enter a number");
        int h =input.nextInt();
        int g=1;

        while (g<11)
        {
            System.out.println(h+"x"+g+"="+(h*g));
            g++;
        }







    }
}
