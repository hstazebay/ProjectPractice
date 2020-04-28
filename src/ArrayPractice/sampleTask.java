package ArrayPractice;

import java.util.Arrays;

public class sampleTask {
    public static void main(String[] args) {
        String name = "Java"; //'j','a','v','a'
        char[] chars = name.toCharArray(); //4
        System.out.println(chars[0]);    //'j'
        System.out.println(chars[3]);    //'a'

        String str = "I like java";

        String[] arr = str.split("");
        System.out.println(Arrays.toString(arr));

        String sentence = "Today is great day";
        String[] words = sentence.split("");
        System.out.println(Arrays.toString(words));
        String result = "";

        for (int i = words.length - 1; i > 0; i--) {
            String eachWords = words[i];
            //System.out.print(eachWords+"";
            result += eachWords + "";
        }
    }
}