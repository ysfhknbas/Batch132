package day13multidimentionalarrays;

import java.util.Arrays;

public class Arrays02 {
    public static void main(String[] args) {

        int arr[] = {2,1,7,6};

        Arrays.sort(arr);

        System.out.println(Arrays.binarySearch(arr,2)); //1 index number
        System.out.println(Arrays.binarySearch(arr,5)); //-3 order number doesnt exist

    }
}
