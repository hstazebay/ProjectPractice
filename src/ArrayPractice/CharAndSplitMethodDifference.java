package ArrayPracticeZero;

import java.util.Arrays;

public class CharAndSplitMethodDifference {
    //the difference between the char At and split method

    // splits the string with given value, returns String array

    //   String Str = "Ali go to school";
    // String[] arr = Str.split(" ");{"Ali", "go", "to", "school"}

    public static void main(String[] args) {

        String str2 = "ABCDEFJ"; //this is string array

        // ["A","B",....]

        String[] arr2 = str2.split("");   // the result is string array

        char[] ch2 = str2.toCharArray();   // ['A', 'B', 'C'....]  the result is char array

        System.out.println(Arrays.toString(arr2));    // this one solution, we can get array with the string


    }
}
