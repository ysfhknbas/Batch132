package day15arraylists;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArrayLists03 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("enter a letter");
        char letter = input.next().charAt(0);

        List<Character> myList = new ArrayList<>();
        myList.add('J');
        myList.add('A');
        myList.add('V');
        myList.add('A');


            if(myList.contains(letter))
            {
            myList.set(myList.indexOf(letter),'X' );
            }
            else myList.add(letter);


        System.out.println(myList);











    }
}
