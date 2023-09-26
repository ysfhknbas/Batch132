package day26collectionsiterators;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Iterators01 {
    public static void main(String[] args) {


        List<String> myList = new ArrayList<>();

        myList.add("Tom");
        myList.add("Joe");
        myList.add("Ali");
        myList.add("Mor");
        myList.add("Jim");
        System.out.println(myList);


        Iterator<String> myItr = myList.iterator();


        while (myItr.hasNext()){

            myItr.next();

            myItr.remove();
        }
        System.out.println(myList);

        //*********************************************************************************


        List<String> mList = new ArrayList<>();

        mList.add("Tom");
        mList.add("Joe");
        mList.add("Ali");
        mList.add("Mor");
        mList.add("Jim");
        System.out.println(mList);

        ListIterator<String> mListItr = mList.listIterator();

        while (mListItr.hasNext()){

            String el = mListItr.next();

            mListItr.set(el+"...");

        }
        System.out.println(mList);

        //**********************************************************************

        List<String> yourList = new ArrayList<>();

        yourList.add("Tom");
        yourList.add("Joe");
        yourList.add("Ali");
        yourList.add("Mor");
        yourList.add("Jim");
        System.out.println(yourList);

        ListIterator<String> yourListItr = yourList.listIterator();

        while (yourListItr.hasNext()){

            yourListItr.next();
        }

        while (yourListItr.hasPrevious()){
            String el = yourListItr.previous();
            System.out.print(el+" ");
        }






    }
}
