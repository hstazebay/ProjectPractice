package ArrayPractice;

import java.util.Arrays;

public class NestedLoop {
    public static void main(String[] args) {
        char[][] ch2D = {{'A', 'B'}, {'C', 'D', 'E'}, {'F', 'J', 'H'}};
        System.out.println("-------------------For Each yontem----------------------------------");

        for (char[] each1DArray : ch2D) {
            for (char eachElement : each1DArray) {
                System.out.println(eachElement);
            }
        }//for  each we cannot  reverse , because it is start 0
        System.out.println("-------------------En genel yontem----------------------------------");
        int countodd=0;
        for(int i=0; i<ch2D.length;i++){
        for(int j=0; j<ch2D[i].length;j++){
            System.out.println("ch2D["+i+"]["+j+"] "+ch2D[i][j]);
            if(ch2D[i][j]%2==0){
                countodd++;
            }
        }
            System.out.println("Total odd number: "+countodd);

        }
        System.out.println("-------------------Muhtar yontem----------------------------------");
        System.out.println(Arrays.deepToString(ch2D));

    }
}