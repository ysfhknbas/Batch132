package day12arrays;

import java.util.Arrays;

public class Arrays02 {
    public static void main(String[] args) {

        int numbers[] = new int[6];
        int tot = 0;
        numbers[0]=15;
        numbers[1]=12;
        numbers[2]=20;
        numbers[3]=16;
        numbers[4]=17;
        numbers[5]=18;
        System.out.println(Arrays.toString(numbers));
        for (int w:numbers)
        {
            tot = tot + w;
        }
        System.out.println(tot);

        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers));

    }
}
