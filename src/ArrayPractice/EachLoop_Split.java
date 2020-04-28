package ArrayPractice;

public class EachLoop_Split {
    public static void main(String[] args) {


        String sentence = "I like Java";//Java like I
        String[] words = sentence.split(" ");//[I,like,Java]
        for (String eachWord : words) {//0-2
            System.out.println(eachWord);
        }


    }



}
