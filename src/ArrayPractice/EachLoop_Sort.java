package ArrayPractice;

import java.util.Arrays;

public class EachLoop_Sort {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        Arrays.sort(arr1);
        for (int each : arr1) {
            if (each < 5) {
                continue;
            }
            System.out.println(each);


        }
    }
}