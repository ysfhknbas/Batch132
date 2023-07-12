package day09ForLoop01;

import java.util.Scanner;

public class ForLoop01 {
    public static void main(String[] args) {

   /*     for( int i =11;i<45;i++)
        {
            System.out.print(i+" ");
        }


        for( int i='a'-'a'; i<='d';i++)
        {
            System.out.println(i+" ");
        }



        Scanner input =new Scanner(System.in);
        System.out.println("enter something");
        String a= input.next();

        for(int i=0;i<a.length();i++) {
            String b = a.charAt(i) + "*";

            System.out.print(b);
        }


        Scanner input =new Scanner(System.in);
        System.out.println("enter something");
        String a= input.next();


        for (int i=0; i<a.length();i++)
        {
            if(a.indexOf(a.charAt(i))==a.lastIndexOf(a.charAt(i)))
            {
                System.out.print(a.charAt(i)+" ");
            }
        }


*/
    //    Scanner input =new Scanner(System.in);
        //System.out.println("enter something");
//        String a ="Yusuf Bas";
//
//        String b= a.replace(" ","");
//        System.out.println(b);
//        System.out.println(b.length());
//
//        for(int j=b.length()-1 ; j>=0 ; j--)
//        {
//            System.out.print(b.charAt(j));
//        }


//        for (int i=a.length()-1; i>-1;i--)
//        {
//            System.out.print(a.charAt(i));
//        }



        Scanner input =new Scanner(System.in);
        System.out.println("beginning num");
        int a= input.nextInt();
        System.out.println("last num");
        int b= input.nextInt();

//        for(int i=a; i<b;i++)
//        {
//         a=a+(i+1);
//        }
//        System.out.println(a);
        int sum =0;
        for(int i=a; i<=b;i++){

            sum=sum+i;

        }
        System.out.println(sum);


    }
}
