package ArrayPractice;
import java.util.Arrays;
import java.util.Scanner;
public class SortArrayAndDependingOrderWithForLoop {
    public static void main(String[] args) {
        int[] arr = {3,1,4,-1,100, -100, 200, 155};
        Arrays.sort(arr);//[-100,-1,

        int[] arrDesc = new int[arr.length];//[0,0,.....]
//     { -100,-1,1,3,4,100,155, 200}

        System.out.println(Arrays.toString(arr));

        int j = 0;

        for(int i = arr.length -1;  i >= 0; i--){
            // System.out.print( arr[i] +" ");
            arrDesc[j]  = arr[i];

            j++;
        }


        System.out.println(Arrays.toString(arrDesc));

    }
}
