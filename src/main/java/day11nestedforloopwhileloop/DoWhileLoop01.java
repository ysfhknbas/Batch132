package day11nestedforloopwhileloop;

import java.util.Scanner;

public class DoWhileLoop01 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);


        do{
            System.out.println("enter a number");
            int num = input.nextInt();
            if(num<100){
                System.out.println("won");
            }
            else{
                System.out.println("lost");
                break;
            }
        }while (true);



    }
}
