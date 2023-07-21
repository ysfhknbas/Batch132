package day12arrays;

import java.util.Arrays;

public class Arrays03 {
    public static void main(String[] args) {

        String colors[] = new String[5]; //delete whose length is less than 5

        colors[0] ="Brown";
        colors[1] = "Red";
        colors[2] = "Blue";
        colors[3] = "Yellow";
        colors[4]= "White";


        int i=0;
        for (String w: colors)
        {
        if(w.length()>=5)
        {
        i++;
        }
        }

        String newArray[] = new String[i];

        int j=0;
        for (String w: colors)
        {
            if(w.length()>=5)
            {
             newArray[j]=w;
             j++;
            }
        }
        System.out.println(Arrays.toString(newArray));

    }
}
