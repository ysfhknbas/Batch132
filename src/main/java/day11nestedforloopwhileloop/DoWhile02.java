package day11nestedforloopwhileloop;

import java.util.Scanner;

public class DoWhile02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String user ="admin", pass ="pwd123";
        int i=0;
        do{
            if(i==3){
                System.out.println("account blocked");
break;
            }
            System.out.println("enter username and then password");
            String name = input.next();
            String pw = input.next();

            if(name.equals(user)&&pw.equals(pass))
            {
                System.out.println("you are in account");
                break;
            }
            i++;
        }while (i<4);



    }

}
