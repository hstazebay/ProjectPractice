package ArrayPractice;
import java.util.Arrays;
import java.util.Scanner;
public class PrintingArrayandDependingOrderWithForLoop {
    public static void main(String[] args) {

            int[]arr= {1,2,3};

            String r= Arrays.toString(arr);
            System.out.println(r);

            System.out.println(arr);//  give hastag ERROR must be convertment to string before we print

            String names []= { "Medine", "Osman", "Ali"};//we can not print direct lit it gives error

            //System.out.println(names);it give hastag message error

            System.out.println(Arrays.toString(names));

            double[]nums={10,30,39,78};
            System.out.println(Arrays.toString(nums));
            System.out.println(nums[0]);//it return double
            System.out.println(nums[0]+1);//it become addition  11


        }















}
